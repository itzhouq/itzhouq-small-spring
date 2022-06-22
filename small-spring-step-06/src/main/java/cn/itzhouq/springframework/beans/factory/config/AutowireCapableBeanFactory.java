package cn.itzhouq.springframework.beans.factory.config;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.BeanFactory;

/**
 /**
 * Extension of the {@link cn.itzhouq.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @author itzhouq
 * @date 6/3/22 11:29
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行BeanPostProcessor接口实现类的 postProcessBeforeInitialization 方法
     * @param existinBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
