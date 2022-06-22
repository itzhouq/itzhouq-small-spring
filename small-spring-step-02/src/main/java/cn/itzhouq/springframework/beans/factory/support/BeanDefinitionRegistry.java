package cn.itzhouq.springframework.beans.factory.support;

import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author itzhouq
 * @date 5/29/22 14:47
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表注册BeanDefinition
     * @param beanName bean名称
     * @param beanDefinition bean定义信息
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
