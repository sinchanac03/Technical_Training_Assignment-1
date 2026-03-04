package Threads.ThreadJoin;

class MyThread1 extends Thread {
    Thread other;

    MyThread1(Thread other) {
        this.other = other;
    }

    public void run() {
        try {
            if (other != null) {
                other.join();
            }
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + "Finished");
    }
}

public class JoinWithMultipleThreads
{
    public static void main(String[] args)
    {
        MyThread1 t1=new MyThread1(null);
        MyThread1 t2=new MyThread1(t1);
        t1.start();
        t2.start();
}
}
