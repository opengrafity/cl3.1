package dev.grafity;

import java.util.Scanner;

public class WithParaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] categories = new String[]{"essentials","snacks","cosmotics","homedecors","stationary"};
        int[] taxs =new int[]{5,8,18,18,12};

        String[] productNames = new String[]{"Rice","Powder","Edible Oil","pen"};
        double[] prices = new double[]{1500,150,300,15};
        String[] prodCategories = new String[]{"essentials","cosmotics","essentials","stationary"};

        int[][] cart = new int[100][2];
        int choice = -1;
        int quantity = 0;
        int totalProducts = 0;
        while(choice != 0 && totalProducts<=100) {
            System.out.println("Choose a product \n 0)Exit");
            for(int i=0;i<productNames.length;i++){
                System.out.println((i+1)+")"+productNames[i] +" - "+prices[i]);
            }
            choice = sc.nextInt();
            if(choice == 0){
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
        String prodCategory = "";
        for(int i=0;i<totalProducts;i++){
            choice = cart[i][0];
            productBill = prices[choice-1] * cart[i][1];
            prodCategory = prodCategories[choice-1];
            for(int j=0;j<categories.length;j++){
                if(categories[j].equals(prodCategory)){
                    tax = tax + ((productBill/100)*taxs[j]);
                    break;
                }
            }
            totalBill += productBill;
        }

        System.out.println("Total Bill "+totalBill);
        System.out.println("Total Tax "+tax);
        System.out.println("Total Cost "+(totalBill+tax));

    }
}
