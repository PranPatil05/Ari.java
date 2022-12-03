package Abstrctclass;

public class Maruti extends Honda{
    @Override
    void run() {
        System.out.println("Maruti is running");
    }
    @Override
    int lite() {
        System.out.println("inside the lite and maruti class");
        return 20;
    }
}
