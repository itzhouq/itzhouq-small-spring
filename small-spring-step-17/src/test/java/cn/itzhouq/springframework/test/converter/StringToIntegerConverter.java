package cn.itzhouq.springframework.test.converter;

import cn.itzhouq.springframework.core.convert.convert.Converter;

/**
 * @author itzhouq
 * @date 6/23/22 07:08
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
