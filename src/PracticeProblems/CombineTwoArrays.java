package PracticeProblems;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,13,5,9};
        int[] arr2={2,4,22,7};

        int length=arr1.length+arr2.length;
        int[] combinationArr=new int[length];

        for (int i=0;i<arr1.length;i++){
            combinationArr[i]=arr1[i];
        }
        int k =0;
        for (int j=length-arr1.length;j<length;j++){
//
            if(k<arr2.length) {
                combinationArr[j] = arr2[k];
                k++;
            }
//
        }

//        for (int ar:combinationArr){
//            System.out.println(ar);
//        }
        int temp=0;

        for(int l=0;l<combinationArr.length;l++){
            for (int m=l+1;m<combinationArr.length;m++){
                if (combinationArr[l]<combinationArr[m]){
                    temp=combinationArr[m];
                    combinationArr[m]=combinationArr[l];
                    combinationArr[l]=temp;
                }

            }
        }

        for (int ar:combinationArr){
            System.out.println(ar);
        }

    }
}
