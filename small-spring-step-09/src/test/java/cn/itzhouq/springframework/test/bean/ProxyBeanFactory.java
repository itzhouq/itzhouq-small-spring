package cn.itzhouq.springframework.test.bean;

import cn.itzhouq.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @author itzhouq
 * @date 6/8/22 07:40
 */
public class ProxyBeanFactory implements FactoryBean<IUserDao> {
    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = ((proxy, method, args) -> {

            // 添加排查方法
            if ("toString".equals(method.getName())) return this.toString();

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "小付哥");
            hashMap.put("10002", "八杯水");
            hashMap.put("10003", "阿毛");

            return "你被代理了" + method.getName() + ": " + hashMap.get(args[0].toString());
        });
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
