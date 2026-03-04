package ExceptionHandling;

public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        int i,j,k=0;
        i=10;j=0;
        try
        {
            k=i/j;
            System.out.println(k); //trying to divide by 0

            int[] arr={1,2,3,4,5,};
            System.out.println(arr[10]);

        }catch (ArithmeticException e) //exception when divided by 0
        {
            System.out.println("Undefined");

        }catch(ArrayIndexOutOfBoundsException e) //array index exception
        {
            System.out.println("Invalid Index");

        } catch (Exception e) { //when we are uncertain about what type of exception
            System.out.println("Unknown Exception occured");
        }finally { //gets executed even when exceptions are there
            System.out.println("This will get executed no matter what");
        }

    }
}
/*only first exception is printed i.e. if exception is found in the first arithmetic
 exception only, then even if any number of exceptions are there it won't get executed
 it will terminate after the first exception itself
*/
