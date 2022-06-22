package cn.itzhouq.springframework.test.converter;

import cn.itzhouq.springframework.core.convert.convert.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author itzhouq
 * @date 6/23/22 07:06
 */
public class StringToLocalDateConverter implements Converter<String, LocalDate> {

    private final DateTimeFormatter DATE_TIME_FORMATTER;

    public StringToLocalDateConverter(String pattern) {
        DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse(source, DATE_TIME_FORMATTER);
    }

}
