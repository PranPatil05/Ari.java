package HackerRank.Basics;

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        minmax(arr);


    }
    public static void minmax(int[]arr){
        Arrays.sort(arr);
        long summin=0L;
        long summax=0L;

        int n= arr.length;
        if(1<=arr[0]&&arr[n-1]<=1000000000){
            for(int i=0; i<=3;i++){
                summin=summin+(long)arr[i];
            }
            for (int i=n-1;i>=(n-4);i--){
                summax=summax+(long)arr[i];
            }

        }
        System.out.println("MinSum"+summin);
        System.out.println("MinSum"+summax);
        System.out.println(summin+"     "+summax);



    }

}
