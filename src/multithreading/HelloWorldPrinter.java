package multithreading;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world is running from the new thread");
    }
}
