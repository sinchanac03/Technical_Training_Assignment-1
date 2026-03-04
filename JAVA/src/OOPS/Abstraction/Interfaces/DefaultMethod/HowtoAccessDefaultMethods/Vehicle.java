package OOPS.Abstraction.Interfaces.DefaultMethod.HowtoAccessDefaultMethods;

public interface Vehicle
{
    default void stop()
    {
        System.out.println("Stopped");
    }
}
class Car implements Vehicle
{
    void carFunction() //no use just to complete class this method is written
    {
        System.out.println("CarFunction");
    }
}
class Bike implements Vehicle
{
    public void stop()
    {
        System.out.println("BikeStopped");
    }
}
class Driver
{
    static void main() {
        Car c1=new Car();
        c1.stop();//1st way to access default method

        Vehicle v=new Car();
        v.stop();//2nd way to access default method

        Bike b=new Bike();
        b.stop();//3rd way to access default method
    }
}