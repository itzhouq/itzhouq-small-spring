package cn.itzhouq.springframework.context;

import cn.itzhouq.springframework.beans.BeansException;

/**
 * @author itzhouq
 * @date 6/4/22 09:58
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
