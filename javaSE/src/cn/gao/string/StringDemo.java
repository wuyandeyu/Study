package cn.gao.string;

import cn.gao.object.ObjectDemo;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;

public class StringDemo{

    /*
    * 字符串特点：固定定长，字符串底层是字符数组存储
    * 字符串常量池：在jvm内存结构中的什么位置
    *  new String("test");此种方式会将在堆内存中存放一个对象。字符串常量池中如果没有，也会将在池中创建一个
    *  String str= "test";此种方式会先去字符串常量池中去找，如果找到就直接去池中取，如果不存在，他将会在池中创建一个
    *  字符串操作：
    *       toLowerCase()
    *       toUpperCase()
    *       charAt()
    *       trim()
    *       indexOf()
    *       replace()
    *       subString()
    *       equals()
    *       toString()
    *       valueOf()
    *       compareTo()
    *       concat()
    *       contains()
    *       getBytes()
    *       matches()
    *       length()
    *       isEmpty()
    *
    * */
    public static void main(String[] args){
        //charAt(int index);返回下标对应的索引
        System.out.println("Test".charAt(1));
        System.out.println("Test".getBytes(StandardCharsets.UTF_8));
        System.out.println("Test".codePointAt(1));

    }
    static int test(){
        /*
        *   反编译之后的代码，说明jvm会更改代码遵循规范
        *   int i = 100;
        *   int j = i;
        *   i++;
        *   return j;
        *   Exception exception;
        *   exception;
        *   i++;
        *   throw exception;
        * */
        int i=100;
        try{
            return i;
        }finally {
            ++i;
        }
    }


}
