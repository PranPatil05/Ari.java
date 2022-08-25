package HackerRank.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double p = 0;
        double ne = 0;
        double z = 0;
        double n = arr.size();
        Collections.sort(arr);
        double f = arr.get(0);
        double la = arr.get((int) (n - 1));
        if (0 < n && n <= 100) {
            if (-100 <= f && la <= 100) {


                for (int i = 0; i < n; i++) {
                    if (arr.get(i) > 0) {
                        p++;
                    } else if (arr.get(i) < 0) {
                        ne++;
                    } else if (arr.get(i) == 0) {
                        z++;
                    }
                }


                double pr = p / n;
                double nr = ne / n;
                double zr = z / n;
                System.out.println(String.format("%.6f", pr));
                System.out.println(String.format("%.6f", nr));
                System.out.println(String.format("%.6f", zr));
            }
        }
    }
}
