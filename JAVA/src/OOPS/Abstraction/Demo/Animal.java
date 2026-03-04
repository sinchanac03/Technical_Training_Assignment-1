package OOPS.Abstraction.Demo;



abstract class Animal {
    abstract void sound();

    void run()
    {
        System.out.println("Runs");

    }
}
class Lion extends Animal
{
    //sound function hidden in above class so override it here
    void sound()
    {
        System.out.println("Roars");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Meow");//different body should be written
    }
}
class Driver
{
    public static void main(String args[])
    {
        Lion l=new Lion();
        l.sound();
        l.run();
        Cat c=new Cat();
        c.sound();
        c.run();
    }
}
