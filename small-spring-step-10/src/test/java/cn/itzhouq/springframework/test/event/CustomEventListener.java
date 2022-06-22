package cn.itzhouq.springframework.test.event;

import cn.itzhouq.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author itzhouq
 * @date 6/12/22 11:16
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
