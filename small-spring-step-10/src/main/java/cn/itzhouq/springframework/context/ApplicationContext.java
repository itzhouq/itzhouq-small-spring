package cn.itzhouq.springframework.context;

import cn.itzhouq.springframework.beans.factory.HierarchicalBeanFactory;
import cn.itzhouq.springframework.beans.factory.ListableBeanFactory;
import cn.itzhouq.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 * @author itzhouq
 * @date 6/4/22 09:57
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
