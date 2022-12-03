package Array;

public class Different {
    public static void main(String[] args) {
        int[] a={1,3,4,5,3};
        char[] b={'A','B','A','C','D'};

        Different obj=new Different();
        //obj.removeSameElement(a);
        obj.removeSameElement(b);

    }

//    public static void removeSameElement(int[] arr)
//    {
//        for (int i = 0; i < arr.length; i++)
//        {
//            int j;
//            for (j = 0; j < i; j++) {
//
//                if (arr[i] == arr[j]){
//                    break;
//                }
//            }
//
//            if (i == j)
//                System.out.print( arr[i] + " ");
//        }
//
//    }
    public static void removeSameElement(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j)
                System.out.print(arr[i] + " ");
        }
    }
}
