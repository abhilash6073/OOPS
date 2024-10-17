package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaForProdcuer;
    private Semaphore semaForConsumer;

    public Consumer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaForProdcuer, Semaphore semaForConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaForProdcuer = semaForProdcuer;
        this.semaForConsumer = semaForConsumer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaForConsumer.acquire();
                store.remove();
                System.out.println(name + " bought. Total shirt available: " + store.size());
                semaForProdcuer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }

        }
    }

