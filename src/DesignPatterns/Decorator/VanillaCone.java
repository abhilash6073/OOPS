package DesignPatterns.Decorator;

public class VanillaCone implements Icecream{

    private Icecream icecream;

    public VanillaCone() {
    }

    public VanillaCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (icecream==null){
            return 30;
        }
        else return icecream.getCost() + 30;

    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " VanillaCone ";
    }
}
