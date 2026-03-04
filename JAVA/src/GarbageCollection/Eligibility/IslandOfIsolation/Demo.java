package GarbageCollection.Eligibility.IslandOfIsolation;

//main interview problem
public class Demo
{
    Demo ref; //datatype of this variable is it's own class
}
class Driver
{
    public static void main(String[] args)
    {
         Demo obj1=new Demo();
         Demo obj2=new Demo();

         obj1.ref=obj2;
         obj2.ref=obj1;

         obj1=null;
         obj2=null;


    }
}