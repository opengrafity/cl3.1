package dev.grafity;

public class Student {
    public int id;

    public String name = "Student Name";
    public int age;
    public float fees;

    public int getId() {
        return id;
    }

    public void display(){
        System.out.println("From Super:"+name);
    }

    public float getTotalFee(){
        return fees+(fees*0.05F);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
