package Operators;

import java.util.Scanner;

public class Unary extends Relation {
    public void uni(int a,int b){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter Int1=");
//        int a= input.nextInt();
//        System.out.println("Enter Int2= ");
//        int b= input.nextInt();
        System.out.println("++a= "+(++a));
        System.out.println("a++= "+(a++));

        System.out.println("b--= "+(b--));
        System.out.println("--b= "+(--b));

    }
}
