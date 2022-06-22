package cn.itzhouq.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author itzhouq
 * @date 6/14/22 23:15
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
