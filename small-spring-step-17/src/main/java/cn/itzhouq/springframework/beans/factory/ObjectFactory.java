package cn.itzhouq.springframework.beans.factory;

import cn.itzhouq.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * @author itzhouq
 * @date 6/19/22 09:47
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
