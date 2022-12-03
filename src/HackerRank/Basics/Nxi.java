package HackerRank.Basics;

import java.util.Scanner;

public class Nxi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number=");
        int N= input.nextInt();

        if (2<=N&&N<=20){
            for (int i=1;i<=10;i++){
                int mul=N*i;
                System.out.println(N+"x"+i+"="+mul);
            }

        }

    }

}
