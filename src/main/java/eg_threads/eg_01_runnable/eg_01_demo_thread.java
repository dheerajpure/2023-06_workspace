package eg_threads.eg_01_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @FunctionalInterface
 * public interface Runnable {
 *      public abstract void run();
 *}
 */
public class eg_01_demo_thread {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//        t1.start();
//        t2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(obj1);
        executorService.submit(obj2);
        executorService.shutdown();
    }
}


class A implements Runnable {

    public static final int NUM_50 = 50;

    public void run() {
        for (int i = 1; i <= NUM_50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
