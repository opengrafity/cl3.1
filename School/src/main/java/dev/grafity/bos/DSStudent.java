package dev.grafity.bos;

import dev.grafity.Student;

public class DSStudent extends Student {
    public String name = "DS Student Name";
    public float busFees;
    public void display(){
        System.out.println("From Sub:"+name);
    }
    public float getTotalFee(){
        float totalFee = fees + busFees;
        return totalFee+(totalFee*0.05F);
    }
}
