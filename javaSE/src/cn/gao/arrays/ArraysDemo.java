package cn.gao.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * 数组特点：固定长度，查找快，尾插快，非尾插效率低，是否安全要自己去控制，能重复，数据类型一致，支持基本数据类型和非基本数据类型，数据结构线性表，查找快的原因物理存储循序和逻辑循序一致
 * 存取
 *      存： arr[n]=xx;
 *      取： int xx = arr[n];
 * 查找
 *      遍历，通过索引取值时物理内存地址连续读取需要的时间较快
 * 排序 sort
 *      升序
 *          默认自带
 *      降序
 *          自己实现
 *              实现就要了解
 *                  Comparable java.lang包下  是本身与相同类型的其他对象做比较
 *                      接口的实现是在类的内部
 *                  Comparator java.util包下  两个相同类型的数据在某一处做比较
 *                      接口的实现是在类的外部
 *
 * 数组转集合
 *      1、将数组中的值，逐个迁移到集合中
 *      2、使用自己提供的asList()方法转集合
 *      3、List<String> resultList = new ArrayList<>(array.length);
 *         Collections.addAll(resultList,array);
 *      4、List<String> list5=Stream.of(str).collect(Collectors.toList());   1.8
 *      5、List<String> resultList = List.of(array);                         9
 *
 *
 */
public class ArraysDemo {


    public static void main(String[] args) {
        String[] arr = {"afdfa","sadfas","asdfa","afasdf","afdsf","asdfa"};
        for (int i = 0; i <arr.length ; i++) {
            String[] strings = Arrays.copyOf(arr, arr.length + 1);//通过此种方式阔缩容，底层实际是新数组和旧数组之间替换
        }


        Long[] ass = {2123L,1313L,1234L,1341L};

        Integer[] arrs = {12312,41234,35254,6365,6536};
        List list = ArrayToList(arr);
        List lists = ArrayToList(arrs);
        List list1 = ArrayToList(ass);
        for (Object a:list) {
            System.out.println(a);
        }
        for (Object a:lists) {
            System.out.println(a);
        }
        for (Object a:list1) {
            System.out.println(a);
        }
    }
    /*
    * Arrays.asList(array)
    * 基本数据类型的数组转集合的情况，它会把整个数组当成一个对象存入转好的数组中
    * 如果直接按照上面的操作转完，是不能对转后的集合进行操作，原因是此时转换的集合是数组类中的内部集合类，这个内部集合类中没有定义对集合进行存取操作的方法
    * 所以需要将转换的集合重新放到
    * */
    public static List ArrayToList(String[] array){
        List<String> ints =new ArrayList<String>(array.length);
        Collections.addAll(ints, array);
        return ints;
    }
    public static List ArrayToList(Integer[] array){
        List ints =new ArrayList(Arrays.asList(array));
        return ints;
    }
    public static List ArrayToList(Long[] array){
        Stream<Long> array1 = Stream.of(array);
        List<Long> collect = array1.collect(Collectors.toList());
        return collect;
    }
    public static List ArrayToList(Character[] array){
        List ints =new ArrayList(Arrays.asList(array));
        return ints;
    }

class Test implements  Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
class Demo implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}




    /*
    Arrays.binarySearch(arr, 0, 2, -5);
    使用二进制搜索算法在指定整数数组的范围内搜索指定值。在进行此调用之前，必须对范围进行排序（如通过 sort(int[], int, int) 方法）。
    如果未排序，则结果未定义。如果范围包含多个具有指定值的元素，则无法保证会找到哪一个。
        参数：
        a – 要搜索的数组
        fromIndex – 要搜索的第一个元素（包括）的索引
        toIndex – 要搜索的最后一个元素（不包括）的索引
        key – 要搜索的值
        返回：
            如果它（key）包含在指定范围内的数组中
              返回
                搜索关键字(key)的索引，
            如果它（key）不包含在指定范围内的数组中
              返回
                (-(插入点) - 1)的值。
        插入点定义是：
            将要键插入数组的点：
        插入点范围：
            插入点的范围在索引范围内第一个元素的索引值大于(key)键，（[fromIndex]>key）
            如果在索引范围内的所有元素都小于指定的（key）键，则插入点为 toIndex。
                                                             请注意，这保证了当且仅当找到key时返回值将 >= 0。
        抛出：
        IllegalArgumentException – 如果 fromIndex > toIndex
        ArrayIndexOutOfBoundsException – 如果 fromIndex < 0 或 toIndex > a.length
    */
    public void test(){
        int[] arr = {1,4,8};
        int i = Arrays.binarySearch(arr, 0, 2, -5);
        //插入点（）
        System.out.println(i);
    }
}
