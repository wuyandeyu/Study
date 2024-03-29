package cn.gao.date.old;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class LocalDateDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyMMdd");
        Callable<Date> task =   new Callable<Date>(){
            @Override
            public Date call() throws Exception {
                return DateFormatThreadLocal.convert("20161218");
            }
        };
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Future<Date>> results = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            results.add(pool.submit(task));
        }
        for (Future<Date> future: results) {
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}
