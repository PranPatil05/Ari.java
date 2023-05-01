package PracticeProblems;

public class FactorialNumber {
    public static void main(String[] args) {
        int sum=0;
        int number=145;
        int num=number;

        while (number > 0) {
            int fact=number%10;
            sum=sum+factorial(fact);
            number=number/10;
        }
        System.out.println(sum);

        if (sum==num){
            System.out.println("Number is Peterson Number");
        }else {
            System.out.println("Number is not Peterson Number");
        }

//        System.out.println(factorial(3));
    }

    public static int factorial(int num){
//        int factorial=1;

//        for (int i=num;i>0;i--){
//            factorial=factorial*num;
//        }

        if(num==0){
            return 1;
        }else {
            return num*factorial(num-1);
        }

//        System.out.println(factorial);
//        return factorial;
    }
}
