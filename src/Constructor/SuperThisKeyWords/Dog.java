package Constructor.SuperThisKeyWords;

public class Dog extends Animal {
    String colour="Green";
    static String team="Dog team is here....";
    public void printColour(){
        System.out.println(colour); //Print Current Class Varaible
        System.out.println(super.colour);// Print Parent class variable
    }

    public void printTeam(){
        System.out.println(super.team);
        System.out.println(team);
    }

    public void eating(){
        System.out.println("Dog is eating......");
    }
    public void barking(){
        System.out.println("Dog is Barking.....");
        super.eating();
    }

    public Dog(){
        super();
        System.out.println("Dog is Created.....");
    }

    public static void run(){
//        super.run();//Static method can not super method
        System.out.println(" Dog is running........");
    }
}
