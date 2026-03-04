package ExceptionHandling;
import java.io.*;

public class BufferedReaderExample
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
    }
}
