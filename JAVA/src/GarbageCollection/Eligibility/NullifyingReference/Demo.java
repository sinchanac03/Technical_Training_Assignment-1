package GarbageCollection.Eligibility.NullifyingReference;

public class Demo
{
    public static void main(String[] args)
    {
        Demo obj=new Demo();
        obj=null; //this obj is now eligible for garbage collection
        System.out.println(obj);
    }
}
