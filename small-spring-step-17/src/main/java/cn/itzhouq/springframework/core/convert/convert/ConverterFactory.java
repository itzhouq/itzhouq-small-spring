package cn.itzhouq.springframework.core.convert.convert;

/**
 * A factory for "ranged" converters that can convert objects from S to subtypes of R.
 *
 * 类型转换工厂
 *
 * @author itzhouq
 * @date 6/22/22 21:51
 */
public interface ConverterFactory<S, R> {

    /**
     * Get the convert to convert from S to target type T, where T is also an instance of R.
     * @param <T> the target type
     * @param targetType the target type to convert to
     * @return a convert from S to T
     */
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
