package dev.grafity;

import dev.grafity.bo.CartItem;
import dev.grafity.bo.Category;
import dev.grafity.bo.Product;

import java.util.Scanner;

public class WithObjects {
    public static void main(String[] args) {
        Category[]  categories = new Category[]{
                new Category("essentials",5),
                new Category("cosmetics",18),
                new Category("stationary",12),
        };
        Product[] products = new Product[]{
                new Product("Rice",1500,"essentials"),
                new Product("Powder",150,"cosmetics"),
                new Product("Edible Oil",300,"essentials"),
                new Product("pen",15,"stationary"),
        };
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        int quantity = 0;
        int totalProducts = 0;
        CartItem[] cart = new CartItem[100];

        while(choice != 0 && totalProducts<=100) {
            System.out.println("Choose a product \n 0)Exit");
            for(int i=0;i<products.length;i++) {
                System.out.println((i + 1) + ")" + products[i].name + " - " + products[i].price);
            }
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            System.out.println("Enter quantity");
            quantity = sc.nextInt();
            CartItem item = new CartItem(products[choice-1],quantity);
            cart[totalProducts]=item;
            totalProducts++;
        }
        double totalBill = 0;
        double productBill = 0;
        double tax = 0;
        for(int i=0;i<totalProducts;i++){
            CartItem item = cart[i];
            productBill = item.product.price*item.quantity;
            for(Category cat:categories){
                if(cat.name.equals(item.product.category)){
                    tax = tax + (productBill/100)*cat.tax;
                }
            }
            totalBill += productBill;
        }

        System.out.println("Total:"+totalBill);
        System.out.println("Tax:"+tax);
        System.out.println("Total Cost:"+(totalBill + tax));
    }
}
