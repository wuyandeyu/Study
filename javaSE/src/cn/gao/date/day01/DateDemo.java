package cn.gao.date.day01;

import org.junit.Test;

import java.util.Date;

/**
 * 日期时间类
 */
public class DateDemo {
    /*
     *
     * CST可以为如下4个不同的时区的缩写：
     * 美国中部时间：Central Standard Time (USA) UT-6:00
     * 澳大利亚中部时间：Central Standard Time (Australia) UT+9:30
     * 中国标准时间：China Standard Time UT+8:00
     * 古巴标准时间：Cuba Standard Time UT-4:00
     *
     * 地区时间=GMT+时区值（大致精确范围，误差大）
     * 地区时间=UTC+偏移值（更加精确的范围，误差小）
     *
     * */

    @Test
    public void test(){
        Date date = new Date();//创建日期对象
        System.out.println(date);//默认日期格式（中国标准时间 ）输出
        System.out.println(date.getTime());//获取从1970年1月1日0分0秒到当前时间的毫秒数
        //date.setTime(234L);//用毫秒值的方式设置日期
        System.out.println(date.getTimezoneOffset());//此方法返回的是分钟,应为我们在东八区，时区差为8，60X8=480分钟

        System.out.println(date.toGMTString());//用格林威治时间格式转为字符串
        System.out.println(date.toLocaleString());//本地日期格式将日期格式转为字符串

        //有对应的set方法，就是设置给日期设置值的，我没有测试
        System.out.println(date.getDate());//获取当前日期是本月的第多少天 1-31
        System.out.println(date.getMonth());//获取当前日期是本年的第几个月，月份是从0开始11结束，所以需要手动加1
        System.out.println(date.getYear());//获取当前日期是当前世纪的第多少年，获取的值默认减去了1900年

        //有对应的set方法，就是设置给日期设置值的，我没有测试
        System.out.println(date.getHours());//获取当前日期的时间值
        System.out.println(date.getMinutes());//获取当前日期的分钟值
        System.out.println(date.getSeconds());//获取当前日期的秒值

        //无set方法，说明内部没有提供set方法
        System.out.println(date.getDay());//获取当前日期是本周内的那一天，默认是1-7，但是国外的周日是国内的周一，所以周日对应的数字是1，周六对应的数字是7
        System.out.println(date.toInstant());//返回时间轴上的值，就是utc标准时间，采用的
        System.out.println(date.before(new Date()));//判断当前日期是否早于传入日期
        System.out.println(date.after(new Date()));//判断当前日期是否晚于传入日期

        System.out.println();

    }
}
