package DesignPatterns.Strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{

    //initialise instance variable at class level
    private static BikePathCalculatorStrategy instance;

    private BikePathCalculatorStrategy(){

    }

    // return BikePathCalculatorStrategy object -
    // in case it is not present create once, else return the existing one
    public static BikePathCalculatorStrategy getInstance(){
        if (instance==null) {
            synchronized (BikePathCalculatorStrategy.class) {
                if (instance == null) {
                    return new BikePathCalculatorStrategy();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculation via bike from: " + source + " to " + destination);
    }
}
