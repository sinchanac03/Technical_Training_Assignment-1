package OOPS.Abstraction.Interfaces.Interfaces100NotAbstract;

// program to show why interfaces are not 100% abstract
public interface Demo
{
    void show();
    default void display()
    {
        System.out.println("Default method");
    }
    static void message()
    {
        System.out.println("Static method");
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Demo.message();
    }
}
