package cn.gao.date.day01;


import org.junit.Test;

import java.sql.Time;

/**
 * 时间类演示类
 */

/*
 * Time定义在sql包下是Date得直接子类，就懒得看了，父类有得子类都有
 * */
public class TimeDemo {
    @Test
    public void test() {
        Time time = new Time(2156L);
        System.out.println(time.toLocalTime());
        //System.out.println(time.toInstant());//时间对象没有日期组件所以继承得这个方法为不可用，一旦使用就会引发不支持操作异常UnsupportedOperationException

    }
}
