package cn.itzhouq.springframework.beans.factory.support;


import cn.itzhouq.springframework.beans.BeansException;
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

    /**
     * 使用bean名称查询BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the name of all defined in this registry.
     *
     * 返回注册表中所有的bean名称
     */
    String[] getBeanDefinitionNames();
}
