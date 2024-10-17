package multithreading;

public class ClientRunnable {
    public static void main(String[] args) {
        while (true) {
            ThreadUsingRunnable bullet1 = new ThreadUsingRunnable();
            Thread gun1 = new Thread(bullet1);
            gun1.start();
        }
    }
}
