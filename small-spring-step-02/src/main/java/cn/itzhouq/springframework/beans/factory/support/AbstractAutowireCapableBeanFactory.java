package cn.itzhouq.springframework.beans.factory.support;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author itzhouq
 * @date 6/2/22 07:14
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    Object bean;

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

         addSingleton(beanName, bean);
        return bean;
    }
}
