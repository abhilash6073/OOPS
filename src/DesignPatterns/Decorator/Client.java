package DesignPatterns.Decorator;

public class Client {
    //base - a cone has to be the base, it can be a topping as well
    //everything else will be a topping

    //to create a cone, it is not mandatory to pass an icecream object,
    // hence there needs to be an empty constructor as well

    public static void main(String[] args) {
        Icecream icecream = new ChocolateChip(
                                new VanillaScoop(
                                    new VanillaCone(
                                      new ChocolateChip(
                                        new ChocolateCone()))));

        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }





}
