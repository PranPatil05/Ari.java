package Exception_Handling;

class TooYoungException extends Exception
{
    TooYoungException(String s)
    {
        super(s);
    }
}
class TooOldException extends Exception
{
    TooOldException(String s)
    {
        super(s);
    }
}
class CustomExceptionDemo
{
    public static void main(String arg[]) throws TooOldException, TooYoungException {
        int age = 90;
        if(age > 60)
        {
            throw new TooOldException("Younger age is already over");
        }
        else if(age <18)
        {
            throw new TooYoungException("Please wait same more time");
        }
        System.out.println("Thanks for register");
    }
}

