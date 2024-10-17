package Interfaces;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Birds> birds = new ArrayList<>();
        birds.add(new Crow());
        birds.add(new Sparrow());
        birds.add(new Penguin());

        for (Birds b : birds){
            b.breathe();
        }

        List<IFlyable> flyableBirds = new ArrayList<>();
        flyableBirds.add(new Crow());
        flyableBirds.add(new Sparrow());

        for (IFlyable b : flyableBirds){
            b.fly();
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(100, 100000));
        cars.add(new Car(200, 120000));
        cars.add(new Car(50, 20000));
        cars.add(new Car(250, 200000));
        cars.add(new Car(120, 75000));

        System.out.println("List of unsorted cars");
        System.out.println(cars.toString());

        Collections.sort(cars);
        System.out.println("List of sorted cars");
        System.out.println(cars);
    }
}
