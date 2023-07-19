package dev.grafity;

public abstract class Student {
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

    public abstract float getTotalFee();

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
