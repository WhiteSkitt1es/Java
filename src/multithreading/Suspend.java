package multithreading;

import java.beans.IntrospectionException;

class MyThreadSuspend implements Runnable {
    Thread thrd;
    volatile boolean suspended;
    volatile boolean stopped;

    public MyThreadSuspend(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }
    @Override
    public void run() {
        System.out.println(thrd.getName() + " - started");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(500);
                }
                synchronized (this){
                    while (suspended){
                        wait();
                    }
                    if (stopped){
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " - ending");
        }
        System.out.println(thrd.getName() + " - exit");
    }
    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }
    synchronized void mysuspend() {
        suspended = true;
    }
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
public class Suspend {
    public static void main(String[] args) {
        MyThreadSuspend mt = new MyThreadSuspend("My Thread");

        try {
            Thread.sleep(1000);

            mt.mysuspend();
            System.out.println("Thread is suspended");
            Thread.sleep(1000);

            mt.myresume();
            System.out.println("Thread is resume");
            Thread.sleep(1000);

            mt.mysuspend();
            System.out.println("Thread is suspended");
            Thread.sleep(1000);

            mt.myresume();
            System.out.println("Thread is resume");
            Thread.sleep(1000);

            mt.mysuspend();
            System.out.println("Thread is stopped");
            mt.mystop();
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
        try {
            mt.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
        System.out.println("Ending the main thread");
    }
}
