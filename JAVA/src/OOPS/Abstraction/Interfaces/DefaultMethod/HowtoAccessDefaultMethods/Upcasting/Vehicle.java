package OOPS.Abstraction.Interfaces.DefaultMethod.HowtoAccessDefaultMethods.Upcasting;

public interface Vehicle
{
    void start();
}
class Car implements Vehicle{
    public void start()
    {
        System.out.println("Car started");
    }
}
class Bike implements Vehicle{
    public void start()
    {
        System.out.println("Bike started");
    }
}
class Driver
{
    static void main() {
        Vehicle v1=new Car();
        v1.start();
        Vehicle v2=new Bike();
        v2.start();
    }
}
