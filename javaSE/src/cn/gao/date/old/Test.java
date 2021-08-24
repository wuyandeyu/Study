package cn.gao.date.old;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.SimpleTimeZone;

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

        init();


        int thisYear = today1.getYear(); // 获 取 today 的 年 份 信 息

        int thatYear = date1.getYear(); // 获 取 date 的 年 份 信 息
        System.out.println(thisYear);
        System.out.println(thatYear);

    }
    public static void init() {
        today1 = new Date(); // 创 建 当 天 的 日 期 对 象。
        date1 = new Date(1969, 10, 26); // 创 建 一 个 96 年 10 月 26 日 日 期 对 象。
    }

}
