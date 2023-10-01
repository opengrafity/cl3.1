package com.brytcode;

import com.brytcode.model.Student;

import java.util.ArrayList;
import java.util.List;

interface PrintDecision{
    boolean shouldPrint(Student std);
}

class ByAge implements PrintDecision{
    public boolean shouldPrint(Student std) {
        if(std.getAge()<10){
             return true;
        }
        return false;
    }
}

class ByClass implements PrintDecision{
    public boolean shouldPrint(Student std) {
        if(std.getClassName().equals("10th")) {
            return true;
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Raja", 15, "M", "10th"));
        students.add(new Student(2, "Ramu", 14, "M", "9th"));
        students.add(new Student(3, "Ravi", 15, "M", "10th"));
        students.add(new Student(11, "Pavan", 8, "M", "4th"));
        students.add(new Student(12, "Lalith", 8, "M", "4th"));
        students.add(new Student(13, "Anand", 7, "M", "3rd"));
        students.add(new Student(4, "Rani", 15, "F", "10th"));
        students.add(new Student(5, "Seetha", 13, "F", "9th"));
        students.add(new Student(6, "Preethi", 14, "F", "10th"));
        students.add(new Student(7, "Keerthi", 15, "F", "11th"));
        students.add(new Student(8, "Latha", 8, "F", "4th"));
        students.add(new Student(9, "Rajani", 9, "F", "5th"));
        students.add(new Student(10, "Bhavya", 8, "F", "4th"));
        //print(students, "5th");

        print(students, std->std.getGender().equals("F"));
        print(students, App::isInfant);
    }
    public static void print(List<Student> students, PrintDecision pd){
        for(Student std:students){
            if(pd.shouldPrint(std)){
                System.out.println(std);
            }
        }
    }

    public static boolean isInfant(Student std) {
        if(std.getAge()<8) {
            return true;
        }
        return false;
    }

    public static void printByClassName(List<Student> students, String className) {
        for (Student std : students) {
            if (std.getClassName().equals(className)) {
                System.out.println(std);
            }
        }
    }

    public static void printByAge(List<Student> students,int age) {
        for (Student std : students) {
            if (std.getAge()<age) {
                System.out.println(std);
            }
        }
    }

}