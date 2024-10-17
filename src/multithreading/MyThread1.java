package multithreading;

//public class MyThread1 extends Thread{
//    @Override
//    public void run(){
//        System.out.println("My cooking thread is running");
//        System.out.println("I am happy");
//    }
//}

public class MyThread1 implements Runnable{
    public void run(){
        System.out.println("I'm thread 1, not threat 1");
    }
}

