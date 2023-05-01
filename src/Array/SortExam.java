package Array;

public class SortExam {
    public static void main(String[] args) {
        int[] arr={3,6,7,8,9,2};
        int temp1=0;

        for(int i=0;i < arr.length; i++){
            for(int j= i+1;j < arr.length; j++){
                if(arr[i]<arr[j]){
                    temp1=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp1;
                }
            }
        }

        for(int a:arr){
            System.out.println(a);
        }

    }
}
