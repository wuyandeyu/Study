package cn.gao.date.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(s);
       /* String format = dateFormat.format(parse);
        String[] split = format.split("-");
        int year =Integer.parseInt(split[0]);
        int month =Integer.parseInt(split[1]);
        int day =Integer.parseInt(split[2]);*/
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(parse);

        int day = calendar.get(Calendar.DAY_OF_WEEK);//获取输入的日期是当前周的第几天
        int year = calendar.get(Calendar.YEAR);
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        int friday =Calendar.FRIDAY;//周五
       /*   System.out.println(Calendar.FRIDAY);//星期五  6
            System.out.println(Calendar.SATURDAY);//星期六  7
            System.out.println(Calendar.SUNDAY);//星期天  1
        */
        week=week-2;
        if(friday-day==0){
            calendar.setWeekDate(year,week,day);
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));
        }else if(friday-day>0) {
            day=day+(friday-day);
            calendar.setWeekDate(year,week,day);
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));
        }else {
            day=day-(day-friday);
            calendar.setWeekDate(year,week,day);
            System.out.println("打折日期"+dateFormat.format(calendar.getTime()));
        }
    }
}
