package PracticeProblems;

class IsPrimeNumber{
    public static void main(String[] args){
        boolean res=isPrimeNumber(9);
        System.out.println("Is Number prime ="+res);

    }
    public static boolean isPrimeNumber(int number){
        int count=0;
        if(number==1){
            return true;
        }else{
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }
            }
        }
        if(count==2){

            return true;
        }else{

            return false;
        }
    }
}
