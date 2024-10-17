package DesignPatterns.Strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    //initiate the instance at class level
    private static WalkPathCalculatorStrategy instance;
    //create a private empty constructor
    private WalkPathCalculatorStrategy(){

    }
    //create a public getInstance() method which returns the class object
    public static WalkPathCalculatorStrategy getInstance(){
        if (instance==null){
            synchronized (WalkPathCalculatorStrategy.class){
                if(instance==null){
                    return new WalkPathCalculatorStrategy();
                }
            }
        }
        return instance;
    }


    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path calculation via walk from: " + source + " to " + destination);
    }
}
