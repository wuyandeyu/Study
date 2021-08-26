package cn.gao.date.old;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneDemo {
    @Test
    public void test(){
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String a:availableIDs) {
            System.out.println(a);
        }
    }
    @Test
    public void test1(){
        System.out.println(TimeZone.getDefault().getID());
        System.out.println(ZoneId.systemDefault());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("US/Arizona"));
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
