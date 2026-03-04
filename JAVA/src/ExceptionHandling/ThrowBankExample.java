package ExceptionHandling;

public class ThrowBankExample
{
    public static void main(String[] args)
    {
        try
        {
            int balance=2000;
            int withdraw=3000;
            if(withdraw>balance)
            {
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("Withdraw Successful");
        }catch(ArithmeticException e)
        {
            System.out.println("Exception Caught: " + e.getMessage());//getmessage is to print he above message insuffcient balance
        }
    }
}
