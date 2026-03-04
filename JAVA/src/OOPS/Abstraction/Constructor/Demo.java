package OOPS.Abstraction.Constructor;

//program to show usage of default constructor
public class Demo
{
    Demo()
    {
        System.out.println("I am a constructor");
    }
}
class Driver1
{
    public static void main(String[] args)
    {
        Demo obj1=new Demo();
        Demo obj2=new Demo();
    }
}
