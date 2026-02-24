package tutorial.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {

    private class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World!");
        }
    }

    public void testRunnable(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Task());
    }


    public static void main(String[] args) {
        new  RunnableDemo().testRunnable();
    }
}
