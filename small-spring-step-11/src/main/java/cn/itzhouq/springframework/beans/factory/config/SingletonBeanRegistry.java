package cn.itzhouq.springframework.beans.factory.config;

/**
 * 单例注册表
 * @author itzhouq
 * @date 5/27/22 09:40
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}