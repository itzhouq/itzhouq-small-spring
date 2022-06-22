package cn.itzhouq.springframework.test;

import cn.itzhouq.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itzhouq.springframework.test.event.CustomEvent;
import org.junit.Test;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class ApiTest {

    @Test
    public void test_event() {
        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }
}
