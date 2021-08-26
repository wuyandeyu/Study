package cn.gao.date;

import cn.gao.date.old.DateFormatThreadLocal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class LocalDateDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<LocalDate> task =   new Callable<LocalDate>(){
            @Override
            public LocalDate call() {
                return LocalDate.parse("20160301",DateTimeFormatter.ofPattern("yyyyMMdd"));
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Future<LocalDate>> results = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            results.add(pool.submit(task));
        }
        for (Future<LocalDate> future: results) {
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}
