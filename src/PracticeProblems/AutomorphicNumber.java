package PracticeProblems;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 76;
        int squ = num * num;

        while(num>0){
            if (num%10!=squ%10) {
                System.out.println("Number is not AutomorphicNumber");
                num = num / 10;
                squ = squ / 10;
            }

        }
        System.out.println("Number is AutomorphicNumber ");

//        while (num>0){
//            if (num%10!=squ%10){
//                System.out.println("Number is not AutomorphicNumber");
//            }
//            else if (num%10==squ%10){
//                num=num/10;
//                squ=squ/10;
//            }else if(num==0){
//                System.out.println("Number is  AutomorphicNumber");
//            }
//        }

    }

}
