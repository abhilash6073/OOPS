package multithreading;

public class CubePrinter implements Runnable{
    int n;

    public CubePrinter(int n) {
        this.n = n;
    }

    public void run(){
        System.out.println("Thread is: " + Thread.currentThread().getName() + " Cube of " + n + " is: " + (n*n*n));

    }
}
