package OOPS.Abstraction.Interfaces.DefaultMethod;

public interface Vehicle
{
    void start();//abstract method

    default void stop()//common for all
    {
        System.out.println("Engine stopped\n");
    }
}
class Audi implements Vehicle{
    public void start()
    {
        System.out.println("Audi has started");
    }
}
class BMW implements Vehicle{
    public void start()
    {
        System.out.println("BMW has started");
    }
}
class Mercedes implements Vehicle{
    public void start()
    {
        System.out.println("Mercedes has started");
    }
}
class Driver
{
    static void main() {
        Audi c1=new Audi();
        c1.start();
        c1.stop();
        BMW c2=new BMW();
        c2.start();
        c2.stop();
        Mercedes c3=new Mercedes();
        c3.start();
        c3.stop();
    }
}