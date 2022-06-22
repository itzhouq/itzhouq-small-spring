package cn.itzhouq.springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link cn.itzhouq.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * <p>
 * @author itzhouq
 * @date 6/15/22 07:21
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);
}
