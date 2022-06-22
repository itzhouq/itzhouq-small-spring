package cn.itzhouq.springframework.beans.factory.config;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * 允许自定义修改BeanDefinition属性信息
 * @author itzhouq
 * @date 6/4/22 09:52
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后，实例化bean对象之前，提供修改BeanDefinition属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
