package sample;

public class Student {
    private String name;
    private int sumOrder;

    public Student(String name, int sumOrder){
        this.name = name;
        this.sumOrder = sumOrder;
    }

    public int getSumOrder() { return sumOrder; }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
    public void setSumOrder(int sumOrder) { this.sumOrder = sumOrder; }
}