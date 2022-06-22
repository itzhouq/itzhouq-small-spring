package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author itzhouq
 * @date 6/19/22 10:29
 */
public class SpouseAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }
}
