package Operators;

import java.util.Scanner;

public class Relation extends Logical{
    public void rel (int a, int b){
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter Int1=");
//        int a= input.nextInt();
//        System.out.println("Enter Int2= ");
//        int b= input.nextInt();
        //if a=10;b=20
        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true
    }

}
