package Array;

import java.util.*;

public class Remove_Duplicate_set {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 3};
        char[] b = {'A', 'B', 'A', 'C', 'D'};

        Scanner sc= new Scanner(System.in);
        int s1=sc.nextInt();
        sc.radix();


//        RemoveDuplicateArray obj=new RemoveDuplicateArray();
        RemoveDuplicateArray(a);
//        for (int i : a) {
//            System.out.println(a);
//        }
        //obj.removeDuplicateElement(a);
//        obj.removeDuplicateElement(b);
    }



//    public static  void RemoveDuplicateArray(char[] arr){
//        //HashSet q= new HashSet(Collections.singleton(arr));
//
//        List al= Arrays.asList(arr);
//        HashSet q=new HashSet(al);
//
//        System.out.println(al);
//
//        System.out.println(q);
//
//        Arrays.sort(arr);
//
//        System.out.println(arr);
//
//
//
//
//    }

    public static  void RemoveDuplicateArray(int[] arr){
        Arrays.sort(arr);
//        List bl= Arrays.asList(arr);
//        System.out.println(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        System.out.println(arr);
    }
}
