package Constructor.SuperThisKeyWords;

public class TestSuper {
    public static void main(String[] args) {
        Dog dg=new Dog();// Constuctor call autonatically as object created...Parent and Child
        dg.printColour();//Class Variables
        dg.barking();//calling Parent class method using Super
        dg.printTeam();//Check Static variable works same
        dg.run();//Staic method can used super
    }
}
