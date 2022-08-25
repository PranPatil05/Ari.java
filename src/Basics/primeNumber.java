package Basics;

public class primeNumber {
    public static void main(String[] args) {
        int n= 11;
        int count=0;
        if(n==1){
            System.out.println("a prime");
        }else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Number is Prime number");
        }else{
            System.out.println("number is not prime");
        }

    }

}
