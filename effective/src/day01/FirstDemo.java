package day01;

/**
 * 此类用来描述对象的创建和销毁
 * 静态工厂方法代替构造函数
 *      优势：
 *          1、构造函数的名字都是一样的，但是静态工厂方法就不一样，有名字带有具体含义
 *          2、一个构造函数只能一个唯一的数字签名（就是唯一的参数列表），静态工厂参数列表相同也没关系，因为他们方法名都不同
 *          3、构造器一定会产生一个新的对象，但是静态工厂方法可以将预先构建好的实例缓存起来，进行重复利用
 *
 * 对象创建方式
 *      1、通过公有构造器
 *
 */
public class FirstDemo {
    public FirstDemo(){
        System.out.println("测试显示空参构造函数是否执行");
    }

    private FirstDemo(int a){
        System.out.println("显示私有空参构造函数是否执行");
    }
    protected FirstDemo(int b,int c){
        System.out.println("显示受保护的构造函数是否执行");
    }
    FirstDemo(int x,int y,int z){
        System.out.println("显示默认的构造函数是否执行");
    }


    /**
     *
     * 此方处静态工厂方法与设计模式中的工厂方法模式不同，不同在哪儿？TODO
     * 官方的Boolean的valueOf方法就是采用此技术，此种技术类似设计模式中的享元模式
     *
     * 从来不重复创建对象，将预先构建好的实例缓存起来，进行重复利用，这样的能实现实例可控，形成单例，可以控制不能实例化，不可能出现两个实例相等的情形
     * @param flag
     * @return
     */
    public static Boolean valueOf(boolean flag){
        return flag ? Boolean.TRUE:Boolean.FALSE;
    }

    public static void main(String[] args) {
        FirstDemo.valueOf(true);
    }
}
