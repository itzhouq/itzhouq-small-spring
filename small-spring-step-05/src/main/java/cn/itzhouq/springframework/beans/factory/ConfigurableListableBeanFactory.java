package cn.itzhouq.springframework.beans.factory;


import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;
import cn.itzhouq.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 * @author itzhouq
 * @date 6/3/22 11:23
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
