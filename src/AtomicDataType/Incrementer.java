package AtomicDataType;

public class Incrementer implements Runnable{

    private Count count;
    private AtomicCount atomicCount;

    public Incrementer(Count count, AtomicCount atomicCount) {
        this.count = count;
        this.atomicCount = atomicCount;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println("Count : " + count.incrementAndGet());
            System.out.println("AtomicCount :" + atomicCount.atomicInteger.incrementAndGet());
        }
    }
}
