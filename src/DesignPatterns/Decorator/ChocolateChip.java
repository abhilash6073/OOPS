package DesignPatterns.Decorator;

public class ChocolateChip implements Icecream{

    private Icecream icecream;

    public ChocolateChip(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription()+ " ChocolateChip ";
    }
}
