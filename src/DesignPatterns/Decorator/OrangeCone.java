package DesignPatterns.Decorator;

public class OrangeCone implements Icecream{

    private Icecream icecream;

    public OrangeCone() {
    }

    public OrangeCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (icecream==null){
            return 20;
        }
        else return icecream.getCost()+20;

    }

    @Override
    public String getDescription() {
        if (icecream==null){
            return " OrangeCone ";
        }
        else return icecream.getDescription() + " OrangeCone ";
    }
}
