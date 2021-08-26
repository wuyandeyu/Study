package cn.gao.date.day01;

import org.junit.Test;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * 时区演示类
 */
public class TimeZoneDemo {
    @Test
    public void test(){
        String[] availableIDs = TimeZone.getAvailableIDs(-480);
        for (String a:availableIDs) {
            System.out.println(a);
        }
    }
}
