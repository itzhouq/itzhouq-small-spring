package cn.itzhouq.springframework.test;

import cn.itzhouq.springframework.context.support.ClassPathXmlApplicationContext;
import cn.itzhouq.springframework.test.bean.IUserService;
import org.junit.Test;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class ApiTest {

    @Test
    public void test_autoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
