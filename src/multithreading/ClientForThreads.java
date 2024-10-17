package multithreading;


public class ClientForThreads{
    public static void main(String[] args) {
        ThreadsUsingThreads t1 = new ThreadsUsingThreads();
        t1.start();
        ThreadsUsingThreads.ThreadsUsingThreads2 t2 = new ThreadsUsingThreads.ThreadsUsingThreads2();
        System.out.println(t2.getState());
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getState());
        System.out.println(t1.getState());

    }
}
