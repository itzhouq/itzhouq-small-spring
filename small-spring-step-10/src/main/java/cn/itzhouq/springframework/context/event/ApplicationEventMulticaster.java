package cn.itzhouq.springframework.context.event;

import cn.itzhouq.springframework.context.ApplicationEvent;
import cn.itzhouq.springframework.context.ApplicationListener;

/**
 * Interface to be implemented by objects that can manage a number of
 * {@link cn.itzhouq.springframework.context.ApplicationListener} objects, and publish events to them.
 *
 * 事件广播器
 * @author itzhouq
 * @date 6/12/22 10:18
 */
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
