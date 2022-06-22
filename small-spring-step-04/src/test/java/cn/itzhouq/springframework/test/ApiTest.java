package cn.itzhouq.springframework.test;

import cn.itzhouq.springframework.beans.PropertyValue;
import cn.itzhouq.springframework.beans.PropertyValues;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;
import cn.itzhouq.springframework.beans.factory.config.BeanReference;
import cn.itzhouq.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.itzhouq.springframework.test.bean.UserDao;
import cn.itzhouq.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * @author itzhouq
 * @date 6/2/22 07:24
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService设置属性【uid, userDao】
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uid", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo(); // 查询用户信息小付哥
    }
}
