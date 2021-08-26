package cn.gao.date.day01;

import org.junit.Test;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 日期格式化模板演示类
 */
public class SimpleDateFormatDemo {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyyMMdd HH:mm:ss");//日期格式模板对象
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("US/Arizona"));//设置时区属性
        simpleDateFormat.format(new Date());//日期数据类型转字符串数据类型
        Date parse = simpleDateFormat.parse("20210301 15:15:21");//字符数据类型转日期数据类型
        TimeZone timeZone = simpleDateFormat.getTimeZone();//获取时区对象，通过时区对象.getID()可以获取到时区属性
        System.out.println(timeZone.getID());
        Calendar calendar = simpleDateFormat.getCalendar();
        System.out.println(DateFormatSymbols.getInstance());
        System.out.println(Locale.getDefault());
        SimpleDateFormat simpleDateFormat2= new SimpleDateFormat("yyyyMMdd HH:mm:ss", Locale.getDefault());
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("", DateFormatSymbols.getInstance());
        System.out.println(simpleDateFormat2.format(new Date()));

    }
}
