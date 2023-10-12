package multithreading;

class SumArray {
    private int sum;
     /*synchronized*/ int sumArray(int nums[]) {
        sum = 0;

         for (int i = 0; i < nums.length; i++) {
             sum += nums[i];
             System.out.println("Current value of the amount for " + Thread.currentThread().getName() + ": " + sum);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 System.out.println("Interrupt the main thread");
             }
         }
         return sum;
     }
}

class MyThreads implements Runnable{
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] array;
    int answer;

    public MyThreads(String name, int[] array) {
        thrd = new Thread(this, name);
        this.array = array;
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - started");

        synchronized (sa) {
            answer = sa.sumArray(array);
        }
        //answer = sa.sumArray(array);
        System.out.println("Amount for " + thrd.getName() + ": " + answer);
        System.out.println(thrd.getName() + " - ending");
    }
}
public class Synch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MyThreads mt1 = new MyThreads("Child #1", array);
        MyThreads mt2 = new MyThreads("Child #2", array);
    }
}
