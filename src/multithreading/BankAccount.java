package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);
        try {
            if (lock.tryLock(5000, TimeUnit.MILLISECONDS)){
                if (balance>=amount){

                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+ " completed withdrawal. Remaining balance: " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }

                }
                else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Could not acquire the lock. Will try again later.");
            }

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        if (Thread.currentThread().isInterrupted()){
            System.out.println("Thread interrupted // placeholder text");
        }

    }
    }



//public synchronized void withdraw(int amount){
//    System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//    if (balance>=amount){
//        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        balance -= amount;
//        System.out.println(Thread.currentThread().getName()+ " completed withdrawal. Remaining balance: " + balance);
//    }
//    else {
//        System.out.println(Thread.currentThread().getName() + " Insufficient balance");
