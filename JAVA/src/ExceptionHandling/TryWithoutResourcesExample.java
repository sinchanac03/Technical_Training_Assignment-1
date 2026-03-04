package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithoutResourcesExample
{
    public static void main() throws Exception {
        String str;
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter something: ");
            str=br.readLine();
            System.out.println("You entered: " + str);
        }finally {
            br.close();
        }
    }
}
