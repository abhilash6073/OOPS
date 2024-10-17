package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaForProdcuer;
    private Semaphore semaForConsumer;

    public Producer(Queue<Shirt> store, int maxSizeOfStore, String name, Semaphore semaForProdcuer, Semaphore semaForConsumer) {
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
                semaForProdcuer.acquire();
                store.add(new Shirt());
                System.out.println(name + " produced. Total shirt available: " + store.size());
                semaForConsumer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            }
        }
    }

