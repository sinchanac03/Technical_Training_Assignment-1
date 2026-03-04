package Strings.BufferBuilder;

public class StringBufferExample
{
    public void StringAppend()
    {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("Append:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.append(" World"));
    }
    public void StringInsert()
    {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("\nInsert:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.insert(1,"eee"));
    }
    public void StringReverse()
    {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("\nReverse:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.reverse());
    }
    public static void main(String[] args)
    {
        StringBufferExample obj=new StringBufferExample();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();

    }
}
