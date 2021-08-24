package cn.gao.collection.list;

import java.util.ArrayList;
import java.util.List;

/*
* 底层是数组 默认长度10，扩容机制原数组长度的+右移一位的结果：1.5倍
* 涉及到数组必然是中间插入慢，查找快，非线程安全
* */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //增删遍历
        list.add(1);
        list.remove(0);

    }

}
