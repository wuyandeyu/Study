package cn.gao.definition;


/**
 * 类
 */
class Demo1 {

}

/**
 * 本类，和这个类文件名字一样的类
 */
public class Demo{

}

/**
 * 一个类文件中最多只能有一个public开头的类定义（描述），可以没有public
 */
class Demo2{
    /*
    *
    * 类成员组成
    *       变量：（所处位置和存储位置）
    *           成员变量
    *               实例变量
    *               类变量
    *           局部变量
    *       常量：（存储位置）
    *
    *       代码块：（所处位置和加载时机）
    *           静态代码块
    *           构造代码块
    *           条件流程代码块
    *           异常代码块
    *           同步代码块
    *       方法：（重载 重写）
    *           构造方法
    *           静态方法
    *           非静态方法
    *
    *       内部类
    *           局部内不类
    *           非局部内不类
    *
    * */
    //内部私有类
    private class Demo3{

    }
    //内部保护类
    protected class Demo4{

    }
    //内部公共类
    public class Demo5{

    }
    //内部静态类
    public static class Demo9{

    }
    //内部抽象类
    public abstract class Demo7{

    }
    //内部静态抽象类
    public static abstract class Demo11{

    }
    //内部最终类
    public final class Demo8{

    }
    //内部静态最终类
    public static final class Demo10{

    }
    //内部接口类
    public interface Demo6{

    }

    //内部注解类
    public @interface Demo13{

    }
    //内部枚举类
    public enum Demo14{

    }

    /*
    * 演示局部内部类
    * */
    public  void test(){

        //局部内部公共类
        class Demo5{

        }
        //局部内部抽象类
        abstract class Demo7{

        }
        //局部内部最终类
         final class Demo8{

        }
    }
}