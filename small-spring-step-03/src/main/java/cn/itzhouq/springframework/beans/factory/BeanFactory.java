package cn.itzhouq.springframework.beans.factory;


import cn.itzhouq.springframework.beans.BeansException;

/**
 * @author itzhouq
 * @date 5/27/22 09:28
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
