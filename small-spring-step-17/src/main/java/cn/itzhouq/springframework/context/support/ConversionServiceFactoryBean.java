package cn.itzhouq.springframework.context.support;

import cn.itzhouq.springframework.beans.factory.FactoryBean;
import cn.itzhouq.springframework.beans.factory.InitializingBean;
import cn.itzhouq.springframework.core.convert.ConversionService;
import cn.itzhouq.springframework.core.convert.convert.Converter;
import cn.itzhouq.springframework.core.convert.convert.ConverterFactory;
import cn.itzhouq.springframework.core.convert.convert.ConverterRegistry;
import cn.itzhouq.springframework.core.convert.convert.GenericConverter;
import cn.itzhouq.springframework.core.convert.support.DefaultConversionService;
import cn.itzhouq.springframework.core.convert.support.GenericConversionService;
import com.sun.istack.internal.Nullable;

import java.util.Set;

/**
 * A factory providing convenient access to a ConversionService configured with
 * converters appropriate for most environments. Set the
 * setConverters "converters" property to supplement the default converters.
 *
 * 提供创建 ConversionService 工厂
 *
 * @author itzhouq
 * @date 6/23/22 06:41
 */
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
