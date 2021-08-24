package cn.gao.oop.extendschapter;

public class Child extends Parents{
    public void  childMethod(){
        System.out.println("Child");
    }

    @Override
    public void parentsMethod() {
        super.parentsMethod();
        System.out.println("parentsAndChild");
    }
}
