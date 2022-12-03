package Operators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number=");
        int Num= input.nextInt();

//        if (Num%2==0)
//        {
//            System.out.println("Number is Even");
//        }
//        else
//        {
//            System.out.println("Number is Odd");
//        }
        System.out.println((Num%2==0)?"Number is Even":"Number is odd");
        if(true)
        {
            System.out.println("Boolean requied true and false also valid");
        }

        if (true)
            System.out.println("Only if statement not required enclosure consider 1st statement as if body statement");
        System.out.println("Second line not come in else statement it execute indepandently");


    }
}
