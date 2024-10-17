package DesignPatterns.Strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{
    //create a singleton
    //create a private empty constructor
    //create a public getInstance method which return the class object
    //start by initiating an instance at the class level
    private static CarPathCalculatorStrategy instance;

    private CarPathCalculatorStrategy(){
    }

    public static CarPathCalculatorStrategy getInstance(){
        if(instance==null){
            synchronized (CarPathCalculatorStrategy.class) {
                if (instance == null) {
                    return new CarPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculation via car from: " + source + " to " + destination);
    }
}
