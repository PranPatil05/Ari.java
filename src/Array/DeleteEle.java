package Array;

public class DeleteEle {
    public static void main(String[] args) {
        String[] my_array = {"A","B","A","C","D"};



        for (int i = 0; i < my_array.length; i++) {
            for (int k = i + 1; k < my_array.length; k++) {
                if (my_array[i] == my_array[k]) {
                    System.out.println("Element is Same" + k);
                    my_array=removeTheElement(my_array,k);
                    //System.out.println("Resultant Array: " + Arrays.toString(my_array));
                }
            }
        }
//        System.out.println("Resultant Array: " + Arrays.toString(my_array));
//        for (int i = 0; i < my_array.length; i++){
//            System.out.println(my_array[i]);
//        }
    }
    public static String[] removeTheElement(String[] arr,
                                         int index)
    {

        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }

        String[] anotherArray = new String[arr.length - 1];
        int k=0;
        for (int i = 0; i < arr.length; i++) {

                  if (i == index) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

//    public void remove(int my_array[],int k){
//        System.out.println("Original Array : " + Arrays.toString(my_array));
//
//        // Remove the second element (index->1, value->14) of the array
//        int removeIndex = k;
//
//        for (int i = removeIndex; i < my_array.length - 1; i++) {
//            my_array[i] = my_array[i + 1];
//        }
//// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//        System.out.println("After removing the second element: " + Arrays.toString(my_array));
//
//    }
//    System.out.println("Original Array : " + Arrays.toString(my_array));
//
//        // Remove the second element (index->1, value->14) of the array
//        int removeIndex = 9;
//
//        for (int i = removeIndex; i < my_array.length - 1; i++) {
//            my_array[i] = my_array[i + 1];
//        }
//// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
//        System.out.println("After removing the second element: " + Arrays.toString(my_array));
}

