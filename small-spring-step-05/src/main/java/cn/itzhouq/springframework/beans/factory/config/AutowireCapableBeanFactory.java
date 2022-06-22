package cn.itzhouq.springframework.beans.factory.config;

import cn.itzhouq.springframework.beans.factory.BeanFactory;

/**
 * Extension of the {@link cn.itzhouq.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @author itzhouq
 * @date 6/3/22 11:29
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
