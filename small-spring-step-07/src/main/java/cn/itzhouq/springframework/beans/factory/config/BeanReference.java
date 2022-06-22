package cn.itzhouq.springframework.beans.factory.config;

/**
 * Bean 的引用
 * @author itzhouq
 * @date 6/3/22 07:52
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
