package test21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test21_3 implements Runnable {
    private static long count;
    private final long id = count++;
    private int n = 10;

    public Test21_3(int n) {
        this.n = n;
    }

    public void Fib() {
        int a1 = 1, a2 = 1, m;
        System.out.println(a1 + "----->" + id);
        for (int i = 1; i < n; i++) {
            System.out.println(a2 + "----->" + id);
            m = a2;
            a2 = a1 + a2;
            a1 = m;
        }
    }

    public void run() {
        Fib();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++)
            exec.execute(new Test21_3(4));
        exec.shutdown();
    }
}
