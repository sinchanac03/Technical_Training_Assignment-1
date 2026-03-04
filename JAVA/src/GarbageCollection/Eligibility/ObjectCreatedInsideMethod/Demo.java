package GarbageCollection.Eligibility.ObjectCreatedInsideMethod;

public class Demo
{
    static void createObject()
    {
        Demo obj=new Demo(); //after the method execution is over this object in the heap will get eligible for garbage collection
    }

    public static void main(String[] args)
    {
        createObject();
    }
}

