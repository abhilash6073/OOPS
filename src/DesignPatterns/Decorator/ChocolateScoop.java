package DesignPatterns.Decorator;

public class ChocolateScoop implements Icecream{

    private Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+ " ChocolateScoop ";
    }
}
