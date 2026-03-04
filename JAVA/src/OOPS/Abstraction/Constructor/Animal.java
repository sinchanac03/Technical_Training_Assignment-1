package OOPS.Abstraction.Constructor;

abstract class Animal
{
    Animal()
    {
        System.out.println("Animal constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog()
    {
        System.out.println("Dog constructor");
    }
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.sound();
    }
}

/* why does abstract class have constructor?
->Constructors are used for initialising common data
->when a child class objec is created the parent class constructor runs first
->parent constructor is getting executed because of inheritance and not because of object creation (this is to be answered in the interview)
 */