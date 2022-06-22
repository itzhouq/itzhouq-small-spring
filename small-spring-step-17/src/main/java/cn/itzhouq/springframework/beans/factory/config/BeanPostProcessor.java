package cn.itzhouq.springframework.beans.factory.config;

import cn.itzhouq.springframework.beans.BeansException;

/**
 * 用于修改新实例化 Bean 对象的扩展点
 * @author itzhouq
 * @date 6/4/22 09:53
 */
public interface BeanPostProcessor {

    /**
     * 在bean对象初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
