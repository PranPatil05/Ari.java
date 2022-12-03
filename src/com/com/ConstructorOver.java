package com.com;

public class ConstructorOver {
    int i;
    String j;

    ConstructorOver(){
        super();
        //System.out.println("Blank constructor");

    }
    ConstructorOver (int i,String j){
        this.i=i;
        this.j=j;

    }

    public static void main(String[] args) {
        ConstructorOver obj1=new ConstructorOver();
        obj1.i=20;
        obj1.j="Pnp";
        System.out.println(obj1.i);
        System.out.println(obj1.j);

        ConstructorOver obj2=new ConstructorOver(10,"Pranav");

        System.out.println(obj2.i);
        System.out.println(obj2.j);

    }

}
