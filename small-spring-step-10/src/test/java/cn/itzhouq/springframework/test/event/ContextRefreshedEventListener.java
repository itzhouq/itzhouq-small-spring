package cn.itzhouq.springframework.test.event;

import cn.itzhouq.springframework.context.ApplicationListener;
import cn.itzhouq.springframework.context.event.ContextRefreshedEvent;

/**
 * @author itzhouq
 * @date 6/12/22 11:17
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}
