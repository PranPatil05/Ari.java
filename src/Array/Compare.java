package Array;

public class Compare {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 5,3};
        String[] g={"Abc","cde","Abc"};

//        for (int i = 0; i < a.length; i++) {
//            System.out.println("i=" + i);
//            for (int k = i + 1; k < a.length; k++) {
//                if (a[i] != a[k]) {
//                    System.out.println("Element is different");
//                } else if (a[i] == a[k]) {
//                    System.out.println("Element is Same");
//
//                        }
//                    }
//
//
//                }
//            }




        // Pick all elements one by one
        for (int i = 0; i < a.length; i++)
        {
            //System.out.println("i="+i);
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++) {
                //System.out.println("j=" + j);

                if (a[i] == a[j]){
                    //System.out.println("Break");
                    break;
                }
            }

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print( a[i] + " ");
        }
        for (int i = 0; i < g.length; i++)
        {
            //System.out.println("i="+i);
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++) {
                //System.out.println("j=" + j);

                if (g[i] == g[j]){
                    //System.out.println("Break");
                    break;
                }
            }

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print( g[i] + " ");
        }
        }
    }





