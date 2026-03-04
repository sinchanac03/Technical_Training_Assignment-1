package ExceptionHandling;

import java.io.IOException;

public class CheckedException
{
    static void readfile() throws IOException
    {
        throw new IOException("File not found");
    }
    static void display() throws IOException
    {
        readfile();
    }
    static void show() throws IOException
    {
        display();
    }
    public static void main(String[] args)
    {
        try
        {
            show();
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
/*here exception is handled manually generally checked exceptions are not
handled like this. Since we have handled manually try-catch block is used in main
 */