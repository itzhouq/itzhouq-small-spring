package cn.itzhouq.springframework.test.common;

import cn.itzhouq.springframework.beans.BeansException;
import cn.itzhouq.springframework.beans.factory.config.BeanPostProcessor;
import cn.itzhouq.springframework.test.bean.UserService;

/**
 * @author itzhouq
 * @date 6/4/22 11:10
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
