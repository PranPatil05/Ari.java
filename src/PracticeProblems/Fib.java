package PracticeProblems;

public class Fib {
    public static void main(String[] args){
        int fir = 0;
        int sec =1;
        int sum;
        System.out.println(fir);
        for(int i=0;i<=10;i++){
            sum=fir+sec;
            fir=sec;
            sec=sum;

            System.out.println(sum);
        }
    }
}
