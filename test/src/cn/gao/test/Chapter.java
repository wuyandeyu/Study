package cn.gao.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chapter {
    private static Scanner scanner;
    private Map<Students, String> map = new HashMap<>();
    private static  int count=0;
    public static void main(String[] args) {
        scanner= new Scanner(System.in);
        System.out.println("请输入ip地址");

        Chapter chapter = new Chapter();
        stop:while (true){
            Students students = new Students();
            students.setIp(scanner.nextLine());//ip是否合法我没做校验
            if(students.getIp()!=null) {
                int count = chapter.register(students);
            }
            if(count>3){

            }
        }
    }

    public int  register(Students students){
        for (Students students1 : map.keySet()) {
            if(students.getIp().equals(students1.getIp())){
                count++;
            }
        }
       return count;



    }
}
