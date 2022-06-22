package cn.itzhouq.springframework;

/**
 * @author itzhouq
 * @date 5/27/22 07:58
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
