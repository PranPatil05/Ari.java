package Loops;

public class SwitchSta {
    public static void main(String[] args) {

        getSizeByNumber(28);

    }

    public static void getSizeByNumber(int number) {
        switch (number) {
            case 28:
                System.out.println("Small size");
                break;

            case 42:
                System.out.println("Medium size");
                break;

            case 44:
                System.out.println("Large size");
                break;

            case 48:
                System.out.println("Extra Large size");
                break;

            default:
                System.out.println("Invalid number.. please provide another number!!");
        }

    }
}
