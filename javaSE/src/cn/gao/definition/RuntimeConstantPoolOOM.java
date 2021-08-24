package cn.gao.definition;

import java.util.HashSet;
import java.util.Set;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true){
            /*
            * 避免full Gc 回收常量池行为，针对1.6即其以下的该版本
            * */
            set.add(String.valueOf(i++).intern());
        }
    }
}
