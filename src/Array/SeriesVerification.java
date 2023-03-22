package Array;

public class SeriesVerification {
    public static void main(String[] args) {
        int[] arr={10,20,30,10,40,50,20,30};
        int count=0;
        int ele = 0;
        int[] arrwitoutRepeat=new int[arr.length];


        for (int i=0;i< arr.length;i++){
            int j=0;
            for (j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
            if (i==j){
//                withoutDuplicates[k++]=arr[i];
                System.out.println(arr[i]);
                ele=arr[i];

            }

        }

    }

}
