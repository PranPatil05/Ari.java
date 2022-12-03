package Operators;

import java.util.Scanner;

public class Logical extends Assignment {
    public void log(int a, int b,int c)  {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter Int1=");
//        int a= input.nextInt();
//        System.out.println("Enter Int2= ");
//        int b= input.nextInt();
//        System.out.println("Enter Int3= ");
//        int c= input.nextInt();
        System.out.println((a>b)&&(c<b));
        System.out.println((a>b)&&(c>b));

        System.out.println((a>b)||(c>b));
        System.out.println((a>b)||(c<b));

        System.out.println(!(a==b));
        System.out.println(!(a>b));
    }
}
