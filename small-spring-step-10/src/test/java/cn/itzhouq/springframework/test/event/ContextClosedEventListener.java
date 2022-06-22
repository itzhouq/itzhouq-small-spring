package cn.itzhouq.springframework.test.event;

import cn.itzhouq.springframework.context.ApplicationListener;
import cn.itzhouq.springframework.context.event.ContextClosedEvent;

/**
 * @author itzhouq
 * @date 6/12/22 11:18
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}
