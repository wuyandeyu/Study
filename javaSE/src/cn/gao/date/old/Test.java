package cn.gao.date.old;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.SimpleTimeZone;

/*
* year - 年减1900; 必须是0到8099.（注意8099是9999减1900。）
* month - 0至11
* day - 1至31
*  1970年1月1日以来的毫秒，GMT 00:00:00不超过8099年的毫秒表示。负数表示1970年1月1日00:00:00 GMT之前的毫秒数。
 * */

public class Test {
    static  Date today1;
    static  Date date1;
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
       // System.out.println(format);

      /*  System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());*/
        /*
        System.out.println(date.after(new Date()));
        System.out.println(date.before(new Date()));
        System.out.println(date.getTime());
        System.out.println(date.toInstant());//表示与这个 Date对象在时间线上相同的点
        System.out.println(date.toString());
        System.out.println();*/
       /* System.out.println(date.getSeconds());//获取秒数
        System.out.println(date.getMinutes());//获取分钟数
        System.out.println(date.getHours());//获取当前小时数
        System.out.println(date.getDay());//周几，国外周日是周一，星期数
        System.out.println(date.getMonth());//月从0开始,月数
        System.out.println(date.getYear());//减了1900，年数
        System.out.println(date.getDate());//日，天数
        System.out.println(date.getTime());//当前毫秒数距离1970 01 01的毫秒数*/
        System.out.println(date.toInstant());//得到一个Instant对象，时间轴上的点对象
        System.out.println(date.toLocaleString());//固定格式输出时间日期
        System.out.println(date.toString());//默认格式将时间数据类型转换为字符串数据类型
        System.out.println(date.toGMTString());//使用格林威治时间，不依赖当地时区
        System.out.println(date.getTimezoneOffset());//返回适用于此Date对象所表示的时间的本地时区相对于UTC的偏移量  国际协调时间
        Date date2 = new Date("Wed Aug 25 15:21:08 CST 2021");
        Date date3 = new Date();//年、月、日、十、分
        Date date4 = new Date();//年、月、日、十、分、秒
        System.out.println(date2);


    }

}
