package cn.itzhouq.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import cn.itzhouq.springframework.beans.factory.config.BeanDefinition;
import cn.itzhouq.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A component provider that scans the classpath from a base package. It then
 * applies exclude and include filters to the resulting classes to find candidates.
 * <p>
 * @author itzhouq
 * @date 6/14/22 23:20
 */
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
