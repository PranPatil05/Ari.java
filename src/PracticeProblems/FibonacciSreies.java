package PracticeProblems;

public class FibonacciSreies {
    public static void main(String[] args){
        int first=0;
        int second=1;
        int limit=100;
        int res=0;
        System.out.println(first);
        System.out.println(res);

        while(res<limit){
            res = first + second;
            System.out.println(res);
            first = second;
            second = res;
        }
    }
}
