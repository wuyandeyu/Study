package cn.gao.date.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);//创建键盘扫描器对象
        String s = scanner.nextLine();//通过键盘扫描器对象调用接收键盘输入的一行字符串的方法
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//定义自己想要的格式模板
        Date parse = dateFormat.parse(s);//按照我上面指定得格式模板格式化我输入的日期字符串，转换过程中有可能输入的内容不合法，
                                        // 根据上面的格式模板（转换）解析失败产生异常，此处要么自己try catch捕获异常，要么throws抛出异常
       /*
        *方式一、
        * String format = dateFormat.format(parse);
        * String[] split = format.split("-");
        * int year =Integer.parseInt(split[0]);
        * int month =Integer.parseInt(split[1]);
        * int day =Integer.parseInt(split[2]);
        *
        * 方式二、使用
        *       add(int field, int amount)
        *       根据日历的规则，将指定的时间量添加或减去给定的日历字段。
        *       录播作业讲解有奖
        * 方式三、就是没有注释代码部分
        * */
        Calendar calendar = Calendar.getInstance();//创建日历对象，其中方式的一种，另一种是多态通过创建子类对象
        calendar.setTime(parse);//将Date转Calendar,日期数据类型转日历类型

        int day = calendar.get(Calendar.DAY_OF_WEEK);//获取输入的日期是当前周的第几天
        int year = calendar.get(Calendar.YEAR);//获取年
        int week = calendar.get(Calendar.WEEK_OF_YEAR);//获取当前年份中的第多少周
        int friday =Calendar.FRIDAY;//周五
       /*   System.out.println(Calendar.FRIDAY);//星期五  6
            System.out.println(Calendar.SATURDAY);//星期六  7
            System.out.println(Calendar.SUNDAY);//星期天  1
        */
        week=week-2;//前两周
        if(friday-day==0){
            //输入的日期正好是周五
            calendar.setWeekDate(year,week,day);//给日历设置日期
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));//输出calendar.getTime()通过日历拿到具体日期对象，
                                                                                // dateFormat.format(calendar.getTime())将拿到的日期使用模板格式将日
            //期数据类转换位字符串数据类型
        }else if(friday-day>0) {
            //输入的日期大于周五
            day=day+(friday-day);
            calendar.setWeekDate(year,week,day);//给日历设置日期
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));
        }else {
            //输入的日期小于周五
            day=day-(day-friday);
            calendar.setWeekDate(year,week,day);//给日历设置日期
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));
        }
    }
}
