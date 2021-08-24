package cn.gao.object;

public class ObjectDemo {

    /*
    * 12个方法，1一个静态代码加载块
    *
    * registerNatives()注册本地方法
    * equals()比较内存地址是否相等==
    * hashCode()通过内存地址值加上其他规则计算生成的一个值
    * clone()复制对象。 Object 的 clone() 方法，还得实现 Cloneable 接口，不是先该接口进行clone时是不合法的
    * toString()转化字符串
    * getClass()获取当前类对象
    * wait()线程等待
    * notify():唤醒线程
    * notifyAll():唤醒所有等待的线程
    * finalize()垃圾回收，System.Gc();
    *
    *
    * 浅拷贝：被复制对象的所有值属性都含有与原来对象的相同，而所有的对象引用属性仍然指向原来的对象。
    * 深拷贝：在浅拷贝的基础上，所有引用其他对象的变量也进行了clone，并指向被复制过的新对象。
    *   equals  clone 都要注意属性也是对象，也需要处理
    * */

    //声明一个本地方法.运行中的Java程序调用本地方法时，虚拟机装载包含这个本地方法的动态库，并调用这个方法。本地方法是联系Java程序和底层主机操作系统的连接方法
    private static native void registerNatives();
    //加载一个本地方法
    static {
        registerNatives();
    }
   /*
    public final native Class<?> getClass();
    public final native void notify();
    public final native void notifyAll();

    protected native Object clone() throws CloneNotSupportedException;
    public final native void wait(long timeout) throws InterruptedException;*/

    //本地hashCode哈希
    public native int hashCode();

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Object o = new Object();

    }
/*
    public final void wait(long timeout, int nanos) throws InterruptedException {
        if (timeout < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException("nanosecond timeout value out of range");
        }

        if (nanos > 0) {
            timeout++;
        }

        wait(timeout);
    }

    public final void wait() throws InterruptedException {
        wait(0);
    }*/

    //
    public boolean equals(Object obj) {
        return (this == obj);
    }
    protected void finalize() throws Throwable { }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
