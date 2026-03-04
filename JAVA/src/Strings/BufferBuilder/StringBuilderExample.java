package Strings.BufferBuilder;

public class StringBuilderExample
{
    public void StringAppend()
    {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("Append:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.append(" World"));
    }
    public void StringInsert()
    {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("\nInsert:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.insert(1,"eee"));
    }
    public void StringReverse()
    {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("\nReverse:");
        System.out.println("Old string: " + sb);
        System.out.println("New string: " + sb.reverse());
    }
    public static void main(String[] args)
    {
        StringBuilderExample obj=new StringBuilderExample();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();

    }
}
