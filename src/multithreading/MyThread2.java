package multithreading;

//public class MyThread2 extends Thread{
//    @Override
//
//    public void run(){
//        System.out.println("My chatting thread is running");
//        System.out.println("I am sad");
//    }
//}

public class MyThread2 implements Runnable{
    public void run(){
        System.out.println("I'm thread 2, not threat 2");
    }
}
