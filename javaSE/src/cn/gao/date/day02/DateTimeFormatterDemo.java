package cn.gao.date.day02;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * 日期格式化类
 */
public class DateTimeFormatterDemo {
    @Test
    public void test(){
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(formatter);
        System.out.println(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(LocalDate.now()));


    }
}
