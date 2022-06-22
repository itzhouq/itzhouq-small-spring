package cn.itzhouq.springframework.context.event;

import cn.itzhouq.springframework.beans.factory.BeanFactory;
import cn.itzhouq.springframework.context.ApplicationEvent;
import cn.itzhouq.springframework.context.ApplicationListener;

/**
 * @author itzhouq
 * @date 6/12/22 10:58
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
