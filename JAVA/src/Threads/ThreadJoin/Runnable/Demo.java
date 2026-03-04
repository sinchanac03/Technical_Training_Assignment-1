package Threads.ThreadJoin.Runnable;

class MyTask implements Runnable
{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Child: " + i);}
    }
}
public class Demo
{
    public static void main(String[] args) throws Exception
    {
        MyTask obj=new MyTask();
        Thread t1=new Thread(obj);
        t1.start();

        t1.join();
        System.out.println("Main thread finished");

    }
}
