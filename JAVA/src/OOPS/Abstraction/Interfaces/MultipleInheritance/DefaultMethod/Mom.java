package OOPS.Abstraction.Interfaces.MultipleInheritance.DefaultMethod;

interface Mom
{
    default void cook()
    {
        System.out.println("Indian");
    }
}
 interface Dad
{
    default void cook()
    {
        System.out.println("Chinese");
    }
}
class Child implements Mom, Dad
{
    @Override
    public void cook() {
        Mom.super.cook();
        //Dad.super.cook(); //any one either mom or dad can be written
    }
}
class Driver
{
    static void main() {
        Child c=new Child();
        c.cook();
    }
}