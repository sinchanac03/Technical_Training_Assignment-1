package ExceptionHandling;

public class ThrowExample
{
    static void checkAge(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible");
        }
        else
        {
            throw new RuntimeException("Not eligible");
        }
    }
    public static void main(String[] args)
    {
        checkAge(25);
        /*prints first then shows exception.
        If this was after age 12 then it would not print anything after exception */

        checkAge(12);
    }
}
