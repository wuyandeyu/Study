package cn.gao.collection.list;



import java.util.*;

/*
*
* 双链表，插入快，查找慢
* */
public class ArrayLinkListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add("test");
        }
/*
        for (String a:list) {
            System.out.println(a);
        }*/

        //list.forEach(System.out::println);
        list.forEach((String a)->{ System.out.println(a);});
    }

    public void getListMethod(Collection collection){
        //对集合操作
    }
    public void getListMethod(List list){
        //对集合操作
    }
    public void getListMethod(ArrayList arrayList){
        //对集合操作
    }
    public void getListMethod(LinkedList linkedList){
        //对集合操作
    }
     public void getListMethod(HashSet hashSet){
        //对集合操作
    }
     public void getListMethod(TreeSet treeSet){
        //对集合操作
    }

}
