package PracticeProblems;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] ar={12,13,14,15,12,45,13,15};
        RemoveDuplicates(ar);

    }
    public static void RemoveDuplicates(int[] arr){
        for (int i=0;i< arr.length;i++){
            int j;
            for (j=0;j<i;j++){
                if (arr[i] == arr[j]){
//                    System.out.println("Same Elements :"+arr[i]);
                    break;
                }
            }
            if (i==j){
                System.out.println(arr[i]);
            }
        }
    }
}
