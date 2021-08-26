package cn.gao.date;

import org.junit.Test;

import java.time.*;
import java.util.Date;

public class LocalDateDemo1 {
    //DateTimeFormatter 时间格式化
    //TemporalAdjuster 时间矫正器
    //localDate   LocalTime LocalDateTime 人读
    //Instant 时间戳(unix 元年：1970  01 01 00:00:00 到某个时间点的毫秒值)
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);//默认获取UTC时区
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(instant.toEpochMilli());
        System.out.println(Instant.ofEpochSecond(1));
        LocalDateTime localDateTime1 = LocalDateTime.of(2015,10,25,13,26,33);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.plusYears(2);
        System.out.println(localDateTime2);
       // Period period = Period.between(new Date(),new Date());/时间间隔
        Duration duration = Duration.between(instant,instant);//日期间隔

        LocalDateTime localDateTime3 = localDateTime.minusMonths(4);
        System.out.println(localDateTime3);

    }
    @Test
    public void test(){
        /*
        *
        * CST可以为如下4个不同的时区的缩写：
        * 美国中部时间：Central Standard Time (USA) UT-6:00
        * 澳大利亚中部时间：Central Standard Time (Australia) UT+9:30
        * 中国标准时间：China Standard Time UT+8:00
        * 古巴标准时间：Cuba Standard Time UT-4:00
        * */
        Date date = new Date();
        System.out.println(date);//标准的UTC时间 CST就代表了偏移量 +0800
        System.out.println(date.toLocaleString());
        System.out.println(date.toGMTString());



        /*
        * 旧的日期类Date非最终类,获取的是从1970年1月1日0分0秒获取的毫秒值转换成的默认日期时间格式
        * */
        System.out.println(new Date().getTime());//此处时间是从1970开始计算的
        System.out.println(new Date().getYear());//此处的时间要减去1900，不明白为什么？

        /*
        * 新的日期类LocalDate 最终类
        * 没有空参构造，必须年月日三个参数的构造函数，或者通过静态工厂方法获取
        * */
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        new Date().toInstant().atOffset(ZoneOffset.of("+8")).toLocalDateTime();
        /*
        * 从本地时间线LocalDateTime到即时时间线Instant 。 两个时间线之间的差异是与UTC /格林威治的偏移量，由ZoneOffset
         * */
    }

}
