package Enumeration;

enum TrafficLightColor {
    GREEN(10000), YELLOW(2000), RED(12000);

    private long delay;

    TrafficLightColor(int delay){
        this.delay = delay;
    }

    public long getDelay() {
        return delay;
    }
}
class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    public TrafficLightSimulator(TrafficLightColor tlc) {
        thrd = new Thread(this);
        this.tlc = tlc;
        thrd.start();
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }
    @Override
    public void run() {
        while (!stop){
            try {
                Thread.sleep(tlc.getDelay());
                /*switch (tlc) {
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                 */
            } catch (InterruptedException e) {
                System.out.println("Interrupt the main thread");
            }
            changeColor();
        }
    }
    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange() {
        try {
            while (!changed) wait();
            changed = false;
        } catch (InterruptedException e) {
            System.out.println("Interrupt the main Thread");
        }
    }
    TrafficLightColor getColor(){
        return tlc;
    }
    void cancel(){
        stop = true;
    }
}
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tls = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(tls.getColor());
            tls.waitForChange();
        }
        tls.cancel();
    }
}
