package multithreading;

class TickTock {
    String state;
    synchronized void tick(boolean running) { // Поток tick запущен
        if(!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");
        state = "ticked";
        notify(); // Запускаем tock поток
        try {
            Thread.sleep(500);
            while (!state.equals("tocked")) wait(); // Если tock поток не выполнился тогде ждем
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
    }

    synchronized void tock(boolean running) { // Поток tock запущен
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify(); // Запускаем tick поток
        try {
            Thread.sleep(500);
            while (!state.equals("ticked")) wait(); // Если tick поток не выполнился тогде ждем
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main thread");
        }
    }
}
class ThreadMy implements Runnable{
    Thread thrd;
    TickTock tt;
    public ThreadMy(String name, TickTock tt) {
        thrd = new Thread(this, name);
        this.tt = tt;
        thrd.start();
    }
    @Override
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) tt.tick(true);
            tt.tick(false);
        } else {
            for (int i = 0; i < 5; i++) tt.tock(true);
            tt.tock(false);
        }
    }
}
public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        ThreadMy mt1 = new ThreadMy("Tick", tt);
        ThreadMy mt2 = new ThreadMy("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Ending the main thread");
        }
    }
}
