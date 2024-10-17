package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        Thread t = new Thread(hwp);
//        t.start();
//        Thread.sleep(3000);
//        System.out.println("Hello World from the main method");

//        MyThread1 t1 = new MyThread1();
//
//        MyThread2 t2 = new MyThread2();
//
//        t1.start();
//        Thread.sleep(3000);
//        t2.start();
//        MyThread1 bullet1 = new MyThread1();
//        MyThread2 bullet2 = new MyThread2();
//        Thread gun1 =new Thread(bullet1);
//        Thread gun2 = new Thread(bullet2);
//        gun1.start();
//        gun2.start();
//        System.out.println("class of the thread is :" + bullet1.getClass());

//        MyThr t1 = new MyThr("Harry");
//        MyThr t2 = new MyThr("Potter");
//        t1.start();
//        System.out.println("Id of the thread t1 is: " + t1.getId());
//        System.out.println("Name of the thread t1 is: " + t1.getName());
//        t2.start();
//        System.out.println("Id of the thread t2 is: " + t2.getId());
//        System.out.println("Name of the thread t2 is: " + t2.getName());

//        Adder bullet = new Adder(10, 12); //bullet
//        Thread gun = new Thread(bullet);
//
//        gun.start();
//        for (int i=1; i<=50; i++) {
//            SquarePrinter obj = new SquarePrinter(i);
//            Thread t = new Thread(obj);
//            t.start();
//
//        }

        ExecutorService executor = Executors.newScheduledThreadPool(10);
        for (int i=1; i<=50; i++){
            if (i==5 || i==11 || i==20){
                Thread.sleep(1000);
                System.out.println("Debug");
            }
            CubePrinter cubePrinter = new CubePrinter(i);
            executor.execute(cubePrinter);
        }
        System.out.println("Debug");
        executor.shutdown();

    }
}
