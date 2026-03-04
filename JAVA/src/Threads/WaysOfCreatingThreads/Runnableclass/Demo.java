package Threads.WaysOfCreatingThreads.Runnableclass;

//MultipleThreads
class MyTask implements Runnable
{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
        System.out.println("Thread is running: " + i);}
    }
}
class MyTask1 implements Runnable
{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
        System.out.println("Thread is running1: " + i);}
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        MyTask obj=new MyTask(); //task not a thread
        Thread t1=new Thread(obj); //thread1
        t1.start();
        MyTask1 obj1=new MyTask1();
        Thread t2=new Thread(obj1); //thread2
        t2.start();
    }
}