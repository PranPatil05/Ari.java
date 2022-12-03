//package Collection.java;
//
//import java.util.Scanner;
//
//public class Pattern {
//    public static int printAverage(int a, int b,int c){
//        int average = (a+b+c)/2;
//          System.out.println(average);
//          return average;
//         }
//
//
//
//      public static void main(String[] args) {
//          System.out.println("enter the number");
//          Scanner sc = new Sca
//          nner(System.in);
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          int c = sc.nextInt();
//          printAverage(a,b,c);
//          }
//  public static int printSum(int n){
//        int sum = 0;
//        for (int i=1; i<=n; i++){
//            if(i%2 !=0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//        return 1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printSum(n);
//    }
//   public static int printCompare(int a, int b) {
//        if (a > b) {
//            System.out.println( a + "  is greater");
//        } else {
//            System.out.println(b + " is greater");
//        }
//        return 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("enter two nubers");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        printCompare(a, b);
//    }
//   public static double printCircumference(double a){
//        Double cir = 2*3.14* a;
//        System.out.println("the circumference is " + cir);
//        return 1;
//
//    }
//    public static void main(String[] args) {
//        System.out.println("enter radius");
//        Scanner sc = new Scanner(System.in);
//        double r = sc.nextInt();
//        printCircumference(r);
//
//
//    }
//    public static void main(String[] args){
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        System.out.println("enter 1 to continue and 0 to stop");
//        Scanner sc = new Scanner(System.in );
//        int input = sc.nextInt();
//        while(input==1){
//            System.out.println("enter your number");
//            int number = sc.nextInt();
//            if (number>0){
//                positive++;
//            }else if(number<0){
//                negative++;
//            }else{
//                zero++;
//            }
//            System.out.println("enter 1 to continue and 0 to stop");
//            input = sc.nextInt();
//        }
//        System.out.println("positive " + positive);
//        System.out.println("negative " + negative);
//        System.out.println("zero " + zero);
//    }
//   public static void main(String[] args){
//        System.out.println("enter x");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println(" enter n");
//        int n = sc.nextInt();
//        int result=1;
//        for (int i=1; i<=n;i++){
//            result = result*x;
//        }
//        System.out.println("x to the power n is " + result);
//    }
//
//
//    // array
//   public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] numbers = new int[size];
//        for (int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        System.out.println("enter the number to search");
//        int x = sc.nextInt();
//        for (int i=0; i<size;i++){
//            if (numbers[i]==x){
//                System.out.println("x found at index: " + i);
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        int size= sc.nextInt();
//        char names []= new char[size];
//        for (int i=0; i<=size;i++){
//            names [i]= sc.nextLine();
//        }
//
//        for (int i=0; i<=size ; i++){
//            System.out.print(names[i]);
//        }
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        int i;
//        int max = 0;
//
//        for (i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//        int min = a[0];
//        for (i = 0; i < size; i++) {
//            if (a[i] >= max) {
//                max = a[i];
//            }
//            if (a[i] <= min) {
//                min = a[i];
//
//            }
//        }
//        System.out.println("max no is :"+ max);
//        System.out.println("min no is :"+ min);
//    }
//        // 2D Array
//
//}
//}
























