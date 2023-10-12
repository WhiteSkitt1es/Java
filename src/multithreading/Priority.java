package multithreading;

class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean flag = false;
    static String currentName;

    public Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - started");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
            }
            System.out.println("In " + currentName);
        } while (!flag && count < 10000);
        flag = true;

        System.out.println("\n" + thrd.getName() + " - ending");
    }
}
class PriorityDemo {
    public static void main(String[] args) {
        Priority priority1 = new Priority("High priority");
        Priority priority2 = new Priority("Low priority");

        priority1.thrd.setPriority(Thread.MAX_PRIORITY);
        priority2.thrd.setPriority(Thread.MIN_PRIORITY);

        priority1.thrd.start();
        priority2.thrd.start();

        try {
            priority1.thrd.join();
            priority2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
        System.out.println("\nCounter thread High priority: " + priority1.count);
        System.out.println("\nCounter thread Low priority: " + priority2.count);
    }
}
