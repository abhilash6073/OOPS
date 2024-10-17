package Callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(6,7,8,9,10);

        ArrayAdder add1 = new ArrayAdder(list1);
        ArrayAdder add2 = new ArrayAdder(list2);


        ExecutorService executor = Executors.newFixedThreadPool(10);

        Future<Integer> sum1 = executor.submit(add1);
        Future<Integer> sum2 = executor.submit(add2);

        //get the actual values from the futures
        int s1 = sum1.get();
        int s2 = sum2.get();

        executor.shutdown();
        System.out.println("Final result: " + (s1 + s2));

    }
}
