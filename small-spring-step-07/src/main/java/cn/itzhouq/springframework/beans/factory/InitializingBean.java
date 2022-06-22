package cn.itzhouq.springframework.beans.factory;

/**
 *
 * Interface to be implemented by beans that need to react once all their
 * properties have been set by a BeanFactory: for example, to perform custom
 * initialization, or merely to check that all mandatory properties have been set.
 *
 * 实现此接口的bean对象，会在BeanFactory设置属性后做出相应处理，如：执行自定义初始化，或者仅仅检查是否设置了所有强制属性。
 * @author itzhouq
 * @date 6/5/22 10:29
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
