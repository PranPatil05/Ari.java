package Basics;

import java.util.Scanner;

public class EvenOddID {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number= ");
        int num= input.nextInt();
        System.out.println((num % 2 == 0) ? "You entered even number" : "You entered odd number");
        input.close();


    }
}
