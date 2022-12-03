package Array;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] a={1,3,4,5,3};
        char[] b={'A','B','A','C','D'};

        RemoveDuplicateArray obj=new RemoveDuplicateArray();
        //obj.removeDuplicateElement(a);
        obj.removeDuplicateElement(b);

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
    public static void removeDuplicateElement(char[] arr) {
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
