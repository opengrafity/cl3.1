package dev.grafity.bos;

import dev.grafity.Student;

import java.util.Scanner;

public class TestPolimorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 1)Hostal\n 2)Day scholar\n ");
        int choice = Integer.parseInt(sc.nextLine());
        Student std = null;
        if(choice == 1 ){
            Student hsStd = new HostelStudent();
            System.out.println("Enter the fees");
            hsStd.fees = Float.parseFloat(sc.nextLine());
            System.out.println("Enter the hostal fees");
            ((HostelStudent)hsStd).hostalFees = Float.parseFloat(sc.nextLine());
            std = hsStd;
        }else {
            Student dsStd = new DSStudent();
            System.out.println("Enter the fees");
            dsStd.fees = Float.parseFloat(sc.nextLine());
            System.out.println("Enter the bus fees");
            ((DSStudent)dsStd).busFees = Float.parseFloat(sc.nextLine());
            std = dsStd;
        }

        System.out.println(std.getTotalFee());

    }
}
