package cn.itzhouq.springframework.core.convert.support;

import cn.itzhouq.springframework.core.convert.convert.ConverterRegistry;

/**
 * A specialization of {@link GenericConversionService} configuraed by default
 * with converters appropriate for most environments.
 *
 * @author itzhouq
 * @date 6/22/22 23:01
 */
public class DefaultConversionService extends GenericConversionService {

    public DefaultConversionService() {
        addDefaultConverters(this);
    }

    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
