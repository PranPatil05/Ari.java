package PracticeProblems;

public class CreateArrayRemovingDuplicates {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,12,45,13,15};

        for (int i=0;i<arr.length;i++){
            int j;
            for (j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    arr=removeDuplicates(arr,j);
                }
            }
        }
    }

    public static int[] removeDuplicates(int[] arr,int index){
        if (arr == null || index < 0 || index >= arr.length){
            return arr;
        }

        int[] anotherarr=new int[arr.length-1];
        int k=0;
        for (int i=0;i< arr.length;i++){
            if(i==index){
                continue;
            }
            anotherarr[k++]=arr[i];
        }
        return anotherarr;
    }
}
