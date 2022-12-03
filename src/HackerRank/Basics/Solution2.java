package HackerRank.Basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result2.miniMaxSum(arr);

        bufferedReader.close();

    }
}
    class Result2 {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            Collections.sort(arr);
            int n=arr.size();
            long summin=0L;
            long summax=0L;
            long f=arr.get(0);
            long la=arr.get(arr.size()-1);

            if(n<=5){
                if (1<=f&& la<=1000000000){
                    for(int i=0; i<=3;i++){
                        summin=summin+arr.get(i);
                    }
                    for (int i=n-1;i>=(n-4);i--){
                        summax=summax+arr.get(i);
                    }
                }

            }
            System.out.println(summin+" "+summax);


            }

        }


