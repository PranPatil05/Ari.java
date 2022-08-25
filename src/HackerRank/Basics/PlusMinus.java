package HackerRank.Basics;

import java.util.Arrays;

public class PlusMinus {

    public static void main(String[] args) {
        int[]arr={-4, 3, -9, 0, 4, 200};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(arr);
        double p=0;
        double ne=0;
        double z=0;
        double n= arr.length;

        if(0<n&&n<=100) {
            if (-100 <= arr[1] && arr[(int) (n - 1)] <= 100) {


                for (int i = 0; i < n; i++) {
                    if (arr[i] > 0) {
                        p++;
                    } else if (arr[i] < 0) {
                        ne++;
                    } else if (arr[i] == 0) {
                        z++;
                    }
                }

                double pr = p / n;
                double nr = ne / n;
                double zr = z / n;
                System.out.println(p);
                System.out.println(ne);
                System.out.println(z);
                System.out.println(n);

//        System.out.println(pr);
//        System.out.println(nr);
//        System.out.println(zr);
                System.out.println(String.format("%.6f", pr));
                System.out.println(String.format("%.6f", nr));
                System.out.println(String.format("%.6f", zr));

//        List sc=new ArrayList(Collections.singleton(arr));
//        System.out.println(sc);
//        sc.sort(Comparator.naturalOrder());
//        System.out.println("After"+sc);
            }
        }








    }
}
