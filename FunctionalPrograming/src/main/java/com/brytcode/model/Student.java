package com.brytcode.model;

public class Student implements Comparable<Student>{
    private int studentId;
    private String name;
    private int age;
    private String gender;
    private String className;

    public Student() {
    }

    public Student(int studentId, String name, int age, String gender, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student std) {
        return Integer.compare(this.age,std.age);
    }
}
