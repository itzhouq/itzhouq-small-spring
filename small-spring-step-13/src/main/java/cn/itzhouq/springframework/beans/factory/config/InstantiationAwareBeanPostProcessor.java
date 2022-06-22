package cn.itzhouq.springframework.beans.factory.config;

import cn.itzhouq.springframework.beans.BeansException;

/**
 * Subinterface of {@link BeanPostProcessor} that adds a before-instantiation callback,
 * and a callback after instantiation but before explicit properties are set or
 * autowiring occurs.
 * <p>
 * @author itzhouq
 * @date 6/14/22 07:21
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {


    /**
     * Apply this BeanPostProcessor <i>before the target bean gets instantiated</i>.
     *      * The returned bean object may be a proxy to use instead of the target bean,
     *      * effectively suppressing default instantiation of the target bean.
     * 在Bean对象执行初始化方法之前执行此方法
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
