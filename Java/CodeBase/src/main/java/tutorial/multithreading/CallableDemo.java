package tutorial.multithreading;

import java.util.concurrent.*;

public class CallableDemo {

    private class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "Hello World";
        }
    }

    public void testRunnable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new Task());
        System.out.println(future.get().toString());
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new  CallableDemo().testRunnable();
    }
}
