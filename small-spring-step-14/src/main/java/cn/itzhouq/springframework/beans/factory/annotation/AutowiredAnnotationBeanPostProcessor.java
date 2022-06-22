package cn.itzhouq.springframework.beans.factory.annotation;

import cn.hutool.core.bean.BeanUtil;
import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.PropertyValues;
import cn.itzhouq.springframework.beans.factory.BeanFactory;
import cn.itzhouq.springframework.beans.factory.BeanFactoryAware;
import cn.itzhouq.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.itzhouq.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import cn.itzhouq.springframework.util.ClassUtils;

import java.lang.reflect.Field;

/**
 * @author itzhouq
 * @date 6/15/22 07:41
 */
public class AutowiredAnnotationBeanPostProcessor implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private ConfigurableListableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ConfigurableListableBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        // 1. 处理注解@Value
        Class<?> clazz = bean.getClass();
        clazz = ClassUtils.isCglibProxyClass(clazz) ? clazz.getSuperclass() : clazz;

        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            Value valueAnnotation = field.getAnnotation(Value.class);
            if(null != valueAnnotation) {
                String value = valueAnnotation.value();
                value = beanFactory.resolveEmbeddedValue(value);
                BeanUtil.setFieldValue(bean, field.getName(), value);
            }
        }

        // 处理注解 @Autowired
        for (Field field : declaredFields) {
            Autowired autowiredAnnotation = field.getAnnotation(Autowired.class);
            if (null != autowiredAnnotation) {
                Class<?> fieldType = field.getType();
                String dependentBeanName = null;
                Qualifier qualifierAnnotation = field.getAnnotation(Qualifier.class);
                Object dependentName = null;
                if (null != qualifierAnnotation) {
                    dependentBeanName = qualifierAnnotation.value();
                    dependentName = beanFactory.getBean(dependentBeanName, fieldType);
                } else {
                    dependentName = beanFactory.getBean(fieldType);
                }
                BeanUtil.setFieldValue(bean, field.getName(), dependentName);
            }
        }

        return pvs;
    }
}
