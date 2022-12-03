package HackerRank.Basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        double b= sc.nextDouble();
//        Scanner ab=new Scanner(System.in);
        sc.nextLine();
        String str= sc.nextLine();
        sc.close();

        System.out.println("String:"+str);
        System.out.println("Double:"+b);
        System.out.println("Int:"+a);
    }

}
