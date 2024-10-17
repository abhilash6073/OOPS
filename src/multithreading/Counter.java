package multithreading;

public class Counter {

    private static int count = 0;

    public synchronized void increment() {
            count++;
    }

    public static int getCount(){
        return count;
    }
}
