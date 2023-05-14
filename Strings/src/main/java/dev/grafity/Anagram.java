package dev.grafity;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstIn = sc.nextLine();
        System.out.println("Enter second string");
        String secondIn = sc.nextLine();
        String first = "";
        String second = "";

        first = firstIn.toLowerCase();
        second = secondIn.toLowerCase();

        if(first.equals(second)){
            System.out.println("Both the strings are same and obviously anagrams");
            return;
        }
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        String firstSortedStr = new String(firstChars);
        String secondSortedStr = new String(secondChars);

        if(firstSortedStr.equals(secondSortedStr)){
            System.out.println("Both "+firstIn+" and "+secondIn+" are anagrams");
        }else{
            System.out.println("Both "+firstIn+" and "+secondIn+" are not anagrams");
        }
    }
}


