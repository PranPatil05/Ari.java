package Basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First element=");
        int a=sc.nextInt();
        System.out.println("Enter second number=");
        int b=sc.nextInt();

//        int a=5;
//        int b=10;

        int max=(a>b)? a:b;

        System.out.println("Largest of two==="+max);
    }
}
