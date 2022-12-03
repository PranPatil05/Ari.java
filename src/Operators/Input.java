package Operators;

import java.util.Scanner;

//All Operators method Overloaded

public class Input extends Unary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Int1=");
        int a= input.nextInt();
        System.out.println("Enter Int2= ");
        int b= input.nextInt();
        System.out.println("Enter Int3= ");
        int c= input.nextInt();

        Input obj=new Input();
        obj.Arith(a,b);
        obj.ass(a,b);
        obj.log(a,b,c);
        obj.rel(a,b);
        obj.uni(a,b);
    }
}
