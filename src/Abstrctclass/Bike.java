package Abstrctclass;

abstract class Bike{
    public void Bike() {
        System.out.println("bike is created");
    }
    abstract void run();
    abstract void run(int a);
    abstract int lite();
    void changeGear(){System.out.println("gear changed");
    }
}