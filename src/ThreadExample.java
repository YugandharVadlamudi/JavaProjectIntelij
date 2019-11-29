import java.util.Arrays;

public class ThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("ThreadExample.run");
    }
    public static void main(String[] args) /*throws InterruptedException*/ {
        try {
            Thread thread = new Thread(new ThreadExample());
            thread.start();
            System.out.println("ThreadExample.main 1");
            thread.join();
            System.out.println("ThreadExample.main 2");
        } catch (InterruptedException e) {
            System.out.println("args = " + e.getMessage());
        }

    }
}
