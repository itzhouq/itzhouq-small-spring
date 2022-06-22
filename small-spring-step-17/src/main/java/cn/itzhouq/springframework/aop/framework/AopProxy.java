package cn.itzhouq.springframework.aop.framework;

/**
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects.
 *
 * <p>Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 *
 * AOP 代理的抽象
 *
 * <p>
 * @author itzhouq
 * @date 6/13/22 07:42
 */
public interface AopProxy {

    Object getProxy();
}
