package CollectionAndGenerics;

public class Printer<T> {
    T itemToPrint;

    public Printer(T itemToPrint) {
        this.itemToPrint = itemToPrint;
    }

    public void print(){
        System.out.println(itemToPrint);
    }
}
