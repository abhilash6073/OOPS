package multithreading;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("My cooking thread is running");
        System.out.println("I am happy");
    }
}
