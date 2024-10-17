package multithreading;

public class MyThr extends Thread{

    public MyThr(String name){
        super(name);
    }

    public void run(){
        System.out.println("MyThr running here");
    }
}
