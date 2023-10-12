package multithreading;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        thrd = Thread.currentThread();
        System.out.println("Main thread name " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());
        System.out.println();
        System.out.println("Setting the Main Thread Name\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New Main Thread Name " + thrd.getName());
        System.out.println("New Priority " + thrd.getPriority());
    }
}
