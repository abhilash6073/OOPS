package CollectionAndGenerics;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        //print integers
//        Printer<Integer> intPrinter = new Printer<>(5);
////        System.out.println(intPrinter);
//        intPrinter.print();
//
//        //print doubles
//        Printer<Double> dPrinter = new Printer<>(50.00);
////        System.out.println(dPrinter);
//        dPrinter.print();
//
//        //print object student
//        Printer<Student> sPrinter = new Printer<>(new Student("Abhilash", 75));
////        System.out.println(sPrinter);
//        sPrinter.print();

        HashSet<Integer> set = new HashSet<>();
        SetDemo setDemo = new SetDemo(set);
        setDemo.setActions();

    }
}
