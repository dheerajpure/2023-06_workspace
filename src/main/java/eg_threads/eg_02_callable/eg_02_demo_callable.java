package eg_threads.eg_02_callable;

import java.util.concurrent.*;

/**
 * @FunctionalInterface
 * public interface Callable<V> {
 *    V call() throws Exception;
 *}
 */
public class eg_02_demo_callable {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<String> obj1 = new A();
        Callable<String> obj2 = new B();

        Future<String> future1  = executorService.submit(obj1);
        Future<String> future2 = executorService.submit(obj2);

        System.out.println("f 1 ="+future1.get());
        System.out.println("f 2 ="+future2.get());
        executorService.shutdown();
    }
}

class A implements Callable<String> {
    public static final int INT_NO = 5;

    public String call() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= INT_NO; i++) {
            result.append("Hi\n");
            System.out.println("Hi\n");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}

class B implements Callable<String> {
    public String call() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            result.append("Hello\n");
            System.out.println("Hello\n");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result.toString();
    }
}
