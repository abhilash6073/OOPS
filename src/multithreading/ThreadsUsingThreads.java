package multithreading;

public class ThreadsUsingThreads extends Thread {
    public void run() {
      int i=0;
        while (i<10) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning");
            i++;
        }
    }

    public static class ThreadsUsingThreads2 extends Thread {
        public void run() {
           int i=0;
            while (i<10) {

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Welcome. Priority for this thread: " + this.getPriority());
                System.out.println(this.getState());
                i++;
            }
        }


    }
}
