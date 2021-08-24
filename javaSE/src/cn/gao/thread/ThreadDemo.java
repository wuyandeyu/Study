package cn.gao.thread;

import javafx.concurrent.Task;

import java.util.List;
import java.util.Timer;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;

/**
 * 1、定义线程类
 * 2、创建线程对象
 * 3、调用start方法启动线程
 *
 *
 * 五种状态
 *      1、创建状态
 *          start()执行之后进入
 *      2、就绪状态
 *             抢占时间片，拿到时间片后
 *      3、执行状态
 *             sleep()睡眠当前线程进入阻塞状态,yield()放弃当前线程的时间片执行权，回到就绪状态，
 *      4、阻塞状态
 *
 *      5、死亡状态
 *
 *    常用方法
 *       getName()获取线程名称
 *       setName()设置线程名字
 *       sleep();睡眠线程，静态方法，谁执行到了就会睡眠到谁
 *       currentThread()当前线程
 *       step();终止线程（容易丢失数据）
 *       interrupt();中断线程（异常机制）
 *       标记中断线程
 *
 *
 *   线程调度模式
 *      抢占式调度模型
 *          优先级高的抢占cpu时间片高些
 *      均分式调度模式
 *          平均分配时间片
 *  线程优先级1-10，默认是5 优先级高的大概率抢占时间片多一些
 *     方法
 *          setPriority(int a)；设置线程优先级
 *          getPriority()
 *          yield()让位方法，让当前线程从运行状态转为就绪状态，让位了还有概率抢到
 *          sleep()阻塞方法
 *          join(),当前线程进入阻塞状态，执行join()方法的线程执行完了就回到当前线程
 *          setDaemon()守护线程，随同用户线程存在而存在
 *
 *   Object 的wait() 当前线程进入等待状态
 *           notify()
 *           notifyAll()
 *
 *   transient
 *
 *   synchronized
 *
 *
 *
 *    线程创建方式
 *          1、继承Thread类,重写run方法，执行start()方法
 *          2、实现Runnable接口，实现run方法，执行start()方法
 *          3、匿名类形式
 *          4、使用任务接口模式，此种模式是可以接收返回值的，1.8才有的
 *
 */
public class ThreadDemo  extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("asdfsdf");
    }

    public  static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        for (int i =0; i <10000 ; i++) {
            System.out.println(1111);
        }
    }
}

class ThreadRunable implements Runnable{

    @Override
    public void run() {

    }
}


class DemoThird{
   public void Test(){
       FutureTask task = new Task() {
           @Override
           protected Object call() throws Exception {

               return null;
           }
       };
       Thread thread = new Thread(task);
       thread.start();
   }


}