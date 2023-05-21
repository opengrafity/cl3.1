package dev.grafity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassRoom {
    private String name;
    private int numberOfStudents;
    private int maxNumberOfStudents;
    private ArrayList<Student> students = new ArrayList<>();

    boolean addStudent(Student std){
        if(numberOfStudents<maxNumberOfStudents){
            students.add(std);
            numberOfStudents++;
            return true;
        }
        return false;
    }

    boolean addStudent(Student std, int index){
        if(numberOfStudents<maxNumberOfStudents){
            students.add(std);
            numberOfStudents++;
            return true;
        }
        return false;
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    public void setName(String nameArg){
        this.name = nameArg;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", maxNumberOfStudents=" + maxNumberOfStudents +
                ", students=" + students +
                '}';
    }
    public static String titleCase(String text){
        String[] words = text.split(" ");
        String titleText = "";
        for(String word:words){
            titleText += " "+Character.toUpperCase(word.charAt(0))+word.substring(1);
        }
        return titleText;
    }
}
