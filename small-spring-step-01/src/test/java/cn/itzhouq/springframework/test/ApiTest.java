package cn.itzhouq.springframework.test;

import cn.itzhouq.springframework.BeanDefinition;
import cn.itzhouq.springframework.BeanFactory;
import cn.itzhouq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author itzhouq
 * @date 5/27/22 08:02
 */
public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1. 初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
