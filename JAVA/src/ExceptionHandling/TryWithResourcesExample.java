package ExceptionHandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;


public class TryWithResourcesExample
{
    public static void main(String[] args) throws Exception
    {
        String str;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter something: ");
            str= br.readLine();
            System.out.println("You entered: " + str);
        }
    }
}
