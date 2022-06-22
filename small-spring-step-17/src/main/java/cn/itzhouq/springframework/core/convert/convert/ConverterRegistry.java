package cn.itzhouq.springframework.core.convert.convert;

/**
 * For registering converters with a type conversion system.
 *
 * 类型转换注册接口
 *
 * @author itzhouq
 * @date 6/22/22 21:54
 */
public interface ConverterRegistry {


    /**
     * Add a plain converter to this registry.
     * The convertiable source/target pair is derived from the Converer's parameteried type.
     * @throws IllegalArgumentException if the parameterized types could not be resolved
     */
    void addConverter(Converter<?, ?> converter);

    /**
     * Add a generic converter to this registry.
     */
    void addConverter(GenericConverter converter);

    /**
     * Add a ranged converter factory to this registry.
     * The convertible source/target type pair is derived from the ConverterFactory's parameterized types.
     * @throws IllegalArgumentException if the parameterized types could not be resolved
     */
    void addConverterFactory(ConverterFactory<?, ?> converterFactory);

}
