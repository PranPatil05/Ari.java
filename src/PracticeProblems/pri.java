package PracticeProblems;

import java.util.Scanner;

public class pri {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number = ");
        int a=sc.nextInt();
        int counter=0;

        for(int i=1;i<=a;i++){
            if(a%i==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }

        }
}
