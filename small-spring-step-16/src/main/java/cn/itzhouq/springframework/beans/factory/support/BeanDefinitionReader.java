package cn.itzhouq.springframework.beans.factory.support;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.core.io.Resource;
import cn.itzhouq.springframework.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 * @author itzhouq
 * @date 6/3/22 10:34
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
