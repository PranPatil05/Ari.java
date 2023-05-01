package Array;

public class SortArray {
    public static void main(String[] args) {
        int[] ar = {3, 6, 7, 8, 9, 2};
        int temp;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

//        int[] arr={3,6,7,8,9,2};
//        int temp;

//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=arr[i];
//                }
//
//            }

        for(int a:ar){
            System.out.println(a);
        }



//        for (int a:arr){
//            System.out.println(a);
//        }
}
}

