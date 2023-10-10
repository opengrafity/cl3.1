package com.brytcode;

import com.brytcode.model.Student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class AgeFilter implements Predicate<Integer>{
    @Override
    public boolean test(Integer integer) {
        return integer>20;
    }
}
class MyPrinter implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
public class StreamsDemo {
    public static void main(String[] args) {

        /*Stream<Integer> ages = Stream.<Integer> of(10,35,65,84,75,62,32,20);
        //ages.filter(new AgeFilter());
        //ages.filter(num -> num>20).forEach(new MyPrinter());
        ages.filter(num -> num>20).forEach(num->{
            System.out.println(num);
        });*/


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
        students.add(new Student(10, "Rajani", 8, "F", "4th"));

        List<String> stdNames = new ArrayList<>();
        students.stream().map(std->std.getName()).distinct().forEach(s->stdNames.add(s));
        Set<String> names = students.stream().map(std->std.getName()).collect(Collectors.toSet());
        Map<String, Integer> stds = students.stream().collect(Collectors.toMap(std->std.getName(),std->std.getAge(),(oldValue,newValue)->newValue));
        Map<String,List<Student>> stdsByClass = students.stream().collect(Collectors.groupingBy(std->std.getClassName()));
        System.out.println(stdsByClass);

          /*  long count = students
                .stream()
                .filter(s->"M".equals(s.getGender()))
                .map(s->{
                    return s.getName();
                })
                .filter(s->s.startsWith("R"))
                .count();
                //.forEach(System.out::println);
*/

        //students.stream().sorted((one,two)->one.getName().compareTo(two.getName())).forEach(System.out::println);
      //  students.stream().sorted(Comparator.<Student, String> comparing(str->str.getName()).reversed()).forEach(System.out::println);
/*
        Stream.of("John", "Mary", "David", "Sarah", "Michael",
                "Emily", "Robert", "Jennifer", "William", "Linda",
                "Joseph", "Susan", "James", "Karen", "Charles",
                "Nancy", "Thomas", "Lisa", "Daniel","Daniel", "Betty")
                .filter(str->str.length()>5)
                *//*.flatMap(str->{
                    List<Character> chars = new ArrayList<>();
                    for(Character ch:str.toCharArray()){
                        chars.add(ch);
                    }
                    return chars.stream();
                })*//*
                .distinct()
                .sorted()
                .skip(2)
                .forEach(System.out::println);*/



    }
}

