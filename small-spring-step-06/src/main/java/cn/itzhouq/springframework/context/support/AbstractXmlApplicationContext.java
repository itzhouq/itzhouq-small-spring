package cn.itzhouq.springframework.context.support;

import cn.itzhouq.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.itzhouq.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author itzhouq
 * @date 6/4/22 10:23
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
