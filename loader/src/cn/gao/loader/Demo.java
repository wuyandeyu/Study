package cn.gao.loader;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        String str = new String("abc");
        Class cls1 = str.getClass();
        Class cls2 = String.class;
        Class cls3 = Class.forName("java.lang.String");
        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);
    }
}
