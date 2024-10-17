package multithreading;

public class Adder implements Runnable{
    int a;
    int b;

    public Adder(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        System.out.println("Sum of the numbers = " + (a+b));
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
