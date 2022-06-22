package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author itzhouq
 * @date 6/14/22 07:33
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法： " + method.getName());
    }
}
