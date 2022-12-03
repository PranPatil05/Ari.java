package HackerRank.Basics;

import java.util.Scanner;

public class WeiedNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            if(1<=n&&n<=100){
                if(n%2 ==0){
                    if(2<=n&&n<=5){
                        System.out.println("Not Weired");
                    }
                    else if(6<=n&&n<=20) {
                        System.out.println("Weired");
                    }
                    else if(n>=20){
                        System.out.println("Not Weired");
                    }
                }
                else if(n%2 !=0){
                    System.out.println("Weired");
                }

            }


    }

}
