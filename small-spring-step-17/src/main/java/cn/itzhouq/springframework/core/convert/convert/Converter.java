package cn.itzhouq.springframework.core.convert.convert;

/**
 * A converter converts a source object of type {@code S} to a target of type {@code T}.
 *
 * 类型转换处理接口
 * @author itzhouq
 * @date 6/22/22 21:48
 */
public interface Converter<S, T> {

    /** Convert the source object of type {@code S} to target type {@code T}. */
    T convert(S source);
}
