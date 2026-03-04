package Threads.MainSingleThread;

public class Demo
{
    public static void main(String[] args) //main is itself a thread, other user-defined methods are not threads
    {
        System.out.println("Main thread started!");
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Main thread stopped");
    }
}
