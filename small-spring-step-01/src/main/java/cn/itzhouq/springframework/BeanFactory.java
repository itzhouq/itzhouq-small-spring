package cn.itzhouq.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author itzhouq
 * @date 5/27/22 07:59
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
