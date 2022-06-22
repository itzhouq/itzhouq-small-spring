package cn.itzhouq.springframework.core.convert.support;

import cn.itzhouq.springframework.core.convert.convert.Converter;
import cn.itzhouq.springframework.core.convert.convert.ConverterFactory;
import cn.itzhouq.springframework.util.NumberUtils;
import com.sun.istack.internal.Nullable;

/**
 * @author itzhouq
 * @date 6/22/22 23:05
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }

}
