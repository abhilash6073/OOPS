package Interfaces;

public class Car implements Comparable<Car>{
    int speed;
    int price;

    public Car(int speed, int price){
        this.speed = speed;
        this.price = price;
    }

    public int compareTo(Car c){
        return this.price - c.price;

        // if current obj price is more, returns +ve
        // if input car (c) price is more, returns -ve
        // if the prices are same, returns 0
        //c1.compareTo(c2) : +ve -> c1 is costlier
        //c1.compareTo(c2) : -ve -> c2 is costlier
        //c1.compareTo(c2) : 0 -> both are equally priced
    }

    public String toString(){
        return "Car{" + "speed= " + speed + ", price= "+ price + "}";
    }
}
