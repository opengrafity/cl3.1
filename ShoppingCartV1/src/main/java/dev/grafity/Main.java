package dev.grafity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] categories = new String[]{"essentials","snacks","cosmotics","homedecors","stationary"};
        int[] taxs =new int[]{5,8,18,18,12};

        double catOneTax = 5;
        double catTwoTax = 18;
        String productName1 = "Rice";
        double productPrice1 = 1500;
        String categoryName1 = "Essentials";

        String productName2 = "Powder";
        double productPrice2 = 150;
        String categoryName2 = "Cosmotics";

        String productName3 = "Edible Oil";
        double productPrice3 = 300;
        String categoryName3 = "Essentials";

        int[][] cart = new int[100][2];
        int choice = 0;
        int quantity = 0;
        int totalProducts = 0;
        while(choice != 4 && totalProducts<=100) {
            System.out.println("Choose a product 1)Rice\n 2)Powder\n 3)Edible Oil\n 4)Exit ");
            choice = sc.nextInt();
            if(choice == 4){
                break;
            }
            System.out.println("Enter quantity");
            quantity = sc.nextInt();
            cart[totalProducts][0] = choice;
            cart[totalProducts][1] = quantity;
            totalProducts++;
        }
        double totalBill = 0;
        double tax = 0;
        double productBill = 0;
        for(int i=0;i<totalProducts;i++){
            choice = cart[i][0];
            if(choice == 1){
                productBill = (cart[i][1] * productPrice1);
                totalBill = totalBill + productBill;
                tax = tax + ((productBill/100)*catOneTax);
            }else if(choice == 2){
                productBill = (cart[i][1] * productPrice2);
                totalBill = totalBill + productBill;
                tax = tax + ((productBill/100)*catTwoTax);
            }else if(choice == 3){
                productBill = (cart[i][1] * productPrice3);
                totalBill = totalBill + productBill;
                tax = tax + ((productBill/100)*catOneTax);
            }
        }

        System.out.println("Total Bill "+totalBill);
        System.out.println("Total Tax "+tax);
        System.out.println("Total Cost "+(totalBill+tax));

    }
}