package Basics;

import java.util.Scanner;

public class Fibonicis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number if Iteration =");
        int a= sc.nextInt();
        fibonicis(a);


    }
    public static void fibonicis(int a){
        int first_num=0;
        int second_num=1;
        int res;

        for(int i=0;i<a;i++){
            res=first_num+second_num;
//            if(first_num==0){
//               second_num=1;
//            }else {
//                second_num = first_num;
//            }
            first_num=second_num;
            second_num=res;

            System.out.println(res);
        }
    }
}
