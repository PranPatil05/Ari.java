package Exception_Handling;

public class CustomExceptionTest {

    public static void main(String[] args) {

        boolean result = false;
        try {
            result = isValidAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Not a valid age");
        }

        System.out.println(result);
    }

    public static boolean isValidAge(int age) throws InvalidAgeException
    {
        boolean res = false;
        if (age < 18) {
            throw new InvalidAgeException();
        }
        res = true;
        return res;
    }
}

class InvalidAgeException extends Exception
{
    public InvalidAgeException() {
        super("age is not valid.. must be above 18 year");
    }
}
