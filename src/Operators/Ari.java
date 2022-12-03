package Operators;

public class Ari {

    public void Arith(int a, int b){
        //Scanner input=new Scanner(System.in);
        //System.out.println("Enter Int1=");
        //int a= input.nextInt();
        //System.out.println("Enter Int2= ");
        //int b= input.nextInt();
        //System.out.println("int1="+a);
        //System.out.println("int2="+b);
        //if a=20 and b=10
        System.out.println("a+b=" + a + b);//concadation
        System.out.println("a+b=" + (a + b));//20+10
        System.out.println("a-b=" + (a - b));//20-10
        System.out.println("a*b=" + a * b);//20*10
        System.out.println("a/b=" + a / b);//20/10
        System.out.println("a%b=" + a % b);//20%10
        System.out.println("a+=b="+(a+=b));//a=20+10=30
        System.out.println("a-=b="+(a-=b));//a=30-10=20
        System.out.println("a*=b="+(a*=b));//a=20*10=200
        System.out.println("a/=b="+(a/=b));//a=200/10=20
        System.out.println("a%=b="+(a%=b));//a=20%10=0

    }



}
