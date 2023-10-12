package multithreading;


class MyThreading extends Thread{

    MyThreading(String name){
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " - started");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", counter: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + "interrupted");
        }
        System.out.println("ending");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Start the main thread");

        MyThreading mt = new MyThreading("Child #1");

        System.out.println(mt.isAlive());
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println("Interrupt the main thread");
            }
        }
        System.out.println("Ending the main thread");
        System.out.println(mt.isAlive());
    }
}

