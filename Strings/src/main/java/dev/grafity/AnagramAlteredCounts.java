package dev.grafity;

import java.util.Scanner;

public class AnagramAlteredCounts {
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

        if(first.length()!= second.length()){
            System.out.println("Both the strings are of diffrerent lengths and obviously not anagrams");
            return;
        }

        if(first.equals(second)){
            System.out.println("Both the strings are same and obviously anagrams");
            return;
        }
        char ch;
        int flag = isEveryCharExists(first,second);
        if(flag == 0) {
            flag = isEveryCharExists(second,first);
        }
        if(flag == 0){
            System.out.println("Both are anagrams");
        }else{
            System.out.println("Both are not anagrams");
        }
    }

    public static int isEveryCharExists(String fstr, String sstr){
        char ch;
        for(int i=0;i<fstr.length();i++){
            ch = fstr.charAt(i);
            if(!sstr.contains(ch+"")){
                return 1;
            }
        }
        return 0;
    }
}
