package multithreading;

public class SquarePrinter implements Runnable{
    int a;

    public SquarePrinter(int a) {
        this.a = a;
    }

    public void run(){
        System.out.println("Thread name is : " + Thread.currentThread().getName());
        System.out.println("Square of " + a + " is : "+ a*a);
    }
}

