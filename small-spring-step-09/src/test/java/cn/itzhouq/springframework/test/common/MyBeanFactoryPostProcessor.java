package cn.itzhouq.springframework.test.common;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.PropertyValue;
import cn.itzhouq.springframework.beans.PropertyValues;
import cn.itzhouq.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;
import cn.itzhouq.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author itzhouq
 * @date 6/4/22 11:07
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
