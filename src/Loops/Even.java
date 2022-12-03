package Loops;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Startpoint=");
        int a = input.nextInt();
        System.out.println("Enter Endpoint= ");
        int b = input.nextInt();
        System.out.println("<<<<<<<<<<<<<<  Even Numbers >>>>>>>>>>>>>>>>>>>>>>");
        int sumeven = 0;
        int sumodd = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    sumeven = sumeven + i;

                }

            }
        }
        else if (a > b) {
            for (int i = a; i >= b; i--)
                if (i % 2 == 0) {
                    System.out.println(i);
                    sumeven = sumeven + i;
                }


        }
        //Method can print smallest to large even first digit enter is large
//        else if (a > b) {
//            for (int i = b; i <= a; i++)
//                if (i % 2 == 0) {
//                    System.out.println(i);
//                    sumeven = sumeven + i;
//                }
//
//
//        }

        System.out.println(">>>>>Sum Of Even Numbers= " + sumeven);

        System.out.println("<<<<<<<<<<<<<<<<<<<<< Odd Numbers >>>>>>>>>>>>>>>>>");
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    sumodd = sumodd + i;
                }
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--)
                if (i % 2 != 0) {
                    System.out.println(i);
                    sumodd=sumodd+i;

                }


        }
        System.out.println(">>>>Sum of Odd Numbers= "+sumodd);
        int total=sumeven+sumodd;
        System.out.println("Total Sum= "+total);
        int sumtotal=0;
        if (a>b)
        {
            for (int i=a;i>=b;i--)
            {
//                System.out.println(i);
                sumtotal=sumtotal+i;

            }
        }
        else if (a<b)
        {
            for (int i=a;i<=b;i++)
            {
                sumtotal=sumtotal+i;

            }
        }
        System.out.println("Toatal For verification= "+sumtotal);

    }
}