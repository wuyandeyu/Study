package cn.gao.date.old;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar.Builder calendar = new Calendar.Builder();//内部类不知道这么做的意义
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        System.out.println(calendar1);

        //如果用24小时制来分得话,0点-12点前,是AM；12点-24点（即0点）前是PM
        System.out.println(Calendar.AM);//上午          0     00:00AM-11:59:59AM  12小时制度
        System.out.println(Calendar.PM);//下午          1     00:00PM-11:59:59PM  12小时制度
        System.out.println(Calendar.AM_PM);//上午-下午   9     00:00:00-23:59:59   24小时制


        System.out.println(Calendar.DECEMBER);//十二月december  11
        System.out.println(Calendar.NOVEMBER);//十一月november  10
        System.out.println(Calendar.OCTOBER);//十月  october    9
        System.out.println(Calendar.SEPTEMBER);//九月september  8
        System.out.println(Calendar.AUGUST);//八月   august     7
        System.out.println(Calendar.JULY);//七月     july       6
        System.out.println(Calendar.JUNE);//六月     june       5
        System.out.println(Calendar.MAY);//五月      may        4
        System.out.println(Calendar.APRIL);//四月    april      3
        System.out.println(Calendar.MARCH);//三月    march      2
        System.out.println(Calendar.FEBRUARY);//二月 february   1
        System.out.println(Calendar.JANUARY);//一月  january    0


        System.out.println(Calendar.SUNDAY);//周日    1
        System.out.println(Calendar.SATURDAY);//周六  7
        System.out.println(Calendar.FRIDAY);//周五    6
        System.out.println(Calendar.THURSDAY);//周四  5
        System.out.println(Calendar.WEDNESDAY);//周三 4
        System.out.println(Calendar.TUESDAY);//周二   3
        System.out.println(Calendar.MONDAY);//周一    2

        System.out.println(Calendar.DATE); //表示该月的日期  DATE 和 DAY_OF_MONTH 同义词
        System.out.println(calendar1.get(Calendar.DATE));

        System.out.println(Calendar.DAY_OF_WEEK);//代号
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK)); //一周得中数值
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(Calendar.DAY_OF_YEAR);//一年中得多少天的代号6
        System.out.println(calendar1.get(Calendar.DAY_OF_YEAR));

        System.out.println(Calendar.WEEK_OF_MONTH);
        System.out.println(calendar1.get(Calendar.WEEK_OF_MONTH));
        System.out.println(Calendar.WEEK_OF_YEAR);
        System.out.println(calendar1.get(Calendar.WEEK_OF_YEAR));


        System.out.println(Calendar.YEAR);
        System.out.println(calendar1.get(Calendar.YEAR));


        System.out.println(Calendar.MILLISECOND);//毫秒值代号14
        System.out.println(calendar1.get(Calendar.MILLISECOND));
        System.out.println(Calendar.MINUTE);//分钟值代号12
        System.out.println(calendar1.get(Calendar.MINUTE));


        System.out.println(Calendar.MONTH);//月份代号2
        System.out.println(calendar1.get(Calendar.MONTH));

        System.out.println(Calendar.SHORT);//代号1 简短日期年份
        System.out.println(calendar1.get(Calendar.SHORT));
        System.out.println(Calendar.SHORT_FORMAT);
        System.out.println(calendar1.get(Calendar.SHORT_FORMAT));




        System.out.println("-------------------------------------------------");

        System.out.println(Calendar.ZONE_OFFSET);
        System.out.println(calendar1.get(Calendar.ZONE_OFFSET));//时区偏移量


        System.out.println(Calendar.ALL_STYLES);
        System.out.println(calendar1.get(Calendar.ALL_STYLES));

        System.out.println(Calendar.SHORT);

        System.out.println(Calendar.ERA); //表示时代
        System.out.println(Calendar.FIELD_COUNT); //字段的数量,数量范围0——字段的数量-1

        System.out.println(Calendar.LONG);
        System.out.println(Calendar.LONG_FORMAT);

        System.out.println(Calendar.NARROW_FORMAT);//
        System.out.println(calendar1.get(Calendar.NARROW_FORMAT));
        System.out.println(Calendar.NARROW_STANDALONE);
        System.out.println(Calendar.SHORT_STANDALONE);
        System.out.println(Calendar.SECOND); //代号13
        System.out.println(calendar1.get(Calendar.SECOND));
        System.out.println(Calendar.UNDECIMBER);
        System.out.println(calendar1.get(Calendar.UNDECIMBER));


    }

}
