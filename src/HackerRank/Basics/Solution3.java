package HackerRank.Basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            Result(N);


            bufferedReader.close();
        }
        public static void Result(int N){
            if (2<=N&&N<=20){
                for (int i=1;i<=10;i++){
                    int mul=N*i;
                    System.out.println(N+" "+"x"+" "+i+" "+"="+" "+mul);
                }

            }

        }

}


