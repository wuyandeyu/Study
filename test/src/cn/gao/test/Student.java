package cn.gao.test;

public class Student {
    private String name;
    private String information;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", information='" + information + '\'' +
                '}';
    }
}
