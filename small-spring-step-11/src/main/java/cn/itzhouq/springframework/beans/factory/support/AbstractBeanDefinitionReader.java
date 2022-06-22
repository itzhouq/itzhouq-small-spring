package cn.itzhouq.springframework.beans.factory.support;

import cn.itzhouq.springframework.core.io.DefaultResourceLoader;
import cn.itzhouq.springframework.core.io.ResourceLoader;

/**
 * Abstract base class for bean definition readers which implement
 * @author itzhouq
 * @date 6/3/22 10:36
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
