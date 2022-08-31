package Array;

public class FindSecondLargest {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 3, 5,3};
//        int[] b= a;
//
//        Arrays.sort(b);
//
//        System.out.println(b[b.length-2]);
//        for (int i=0;i<b.length;i++){
//            System.out.println(b[i]);
            int[] arr={10,50,30,40};

            for(int i=0;i< arr.length;i++){
                int temp=0;
                for(int j=i+1;j< arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }

            }

        System.out.println(arr);

            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }

//            int[] newarr= arr;
//
//            Arrays.sort(newarr);
//
//            System.out.println(newarr[newarr.length-2]);

        //pranav Patil made changes - added

        }
    }




