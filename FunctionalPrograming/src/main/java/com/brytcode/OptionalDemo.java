package com.brytcode;

import com.brytcode.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Raja", 15, "M", "10th"));
        students.add(new Student(2, "Ramu", 14, "M", "9th"));
        students.add(new Student(3, "Ravi", 15, "M", "10th"));
        students.add(new Student(11, "Pavan", 8, "M", "4th"));
        students.add(new Student(12, "Lalith", 8, "M", "4th"));
        students.add(new Student(13, "Anand", 7, "M", "3rd"));
        students.add(new Student(4, "Rani", 16, "F", "10th"));
        students.add(new Student(5, "Seetha", 13, "F", "9th"));
        students.add(new Student(6, "Preethi", 14, "F", "10th"));
        students.add(new Student(7, "Keerthi", 16, "F", "11th"));
        students.add(new Student(8, "Latha", 8, "F", "4th"));
        students.add(new Student(9, "Rajani", 9, "F", "5th"));
        students.add(new Student(10, "Rajani", 8, "F", "4th"));

        Optional<Student> myStd = students.stream().filter(std->std.getAge()>=15).max(Comparator.comparingInt(std->std.getAge()));
        myStd.ifPresent(std-> System.out.println(std.getName()));
        myStd.ifPresentOrElse(std-> System.out.println(std.getName()),()->{
            System.out.println("No student with given age exists");
        });

        Map<Integer,Student> stds = students.parallelStream().collect(Collectors.toMap(s->s.getStudentId(), s->s));

        System.out.println(stds.get(4));

        IntSummaryStatistics stats = students.stream().map(s->s.getAge()).collect(Collectors.summarizingInt(s->s));
        System.out.println(stats.getMax());
        /*Student defaultStd = new Student();
        defaultStd.setName("Default");
        Student opStd = myStd.orElse(defaultStd);
        myStd.
        System.out.println(opStd.getName());*/
    }
}
