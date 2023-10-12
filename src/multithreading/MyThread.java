package multithreading;

public class MyThread implements Runnable{
    Thread thrd;

    MyThread(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - started");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", counter: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + "interrupted");
        }
        System.out.println("ending");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Start the main thread");

        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        /* do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupt the main thread");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
        System.out.println("Ending the main thread");
         */
        /*try {
            mt1.thrd.join();
            System.out.println("Child #1 - connect");
            mt2.thrd.join();
            System.out.println("Child #2 - connect");
            mt3.thrd.join();
            System.out.println("Child #3 - connect");
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
        
         */
        System.out.println("Ending the main thread");
    }
}
