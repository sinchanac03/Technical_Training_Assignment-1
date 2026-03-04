package Threads.ThreadJoin;

class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Child: " + i);
        }

    }
}
public class JoinWithSingleThread
{
    public static void main(String[] args)
    {
        MyThread t1=new MyThread();
        t1.start();
        try
        {
            t1.join();
        }catch(Exception e){}
        System.out.println("Main Thread Finished");
    }
}
