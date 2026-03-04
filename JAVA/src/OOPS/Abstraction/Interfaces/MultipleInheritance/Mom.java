package OOPS.Abstraction.Interfaces.MultipleInheritance;

// Multiple inheritance is supported through interfaces in java

interface Mom
{
    void cook();
}
interface Dad
{
    void cook();
}
class Child implements Mom, Dad
{
    @Override //called as annotations - warnings given to the compiler
    public void cook()
    {
        System.out.println("Indian");
    }
}
class Driver
{
    static void main() {
        Child c=new Child();
        c.cook();
    }
}