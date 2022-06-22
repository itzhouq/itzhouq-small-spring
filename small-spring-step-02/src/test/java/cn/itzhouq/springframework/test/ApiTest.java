package cn.itzhouq.springframework.test;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;
import cn.itzhouq.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.itzhouq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4. 第二次获取bean From singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

    // 查询用户信息
    // 查询用户信息
}
