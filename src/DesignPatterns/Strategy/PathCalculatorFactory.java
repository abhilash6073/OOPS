package DesignPatterns.Strategy;

public class PathCalculatorFactory {
    //create a static method called getPathCalculator which takes mode parameter
    //and returns the CarPathCalculatorStrategy, BikePathCalculatorStrategy or WalkPathCalculatorStrategy
    // depending on the input
    //returns a PathCalculatorStrategy (Interface) object

    public static PathCalculatorStrategy getPathCalculator(TransportationMode mode){
        return switch(mode) {
            case TransportationMode.CAR -> CarPathCalculatorStrategy.getInstance();
            case TransportationMode.BIKE -> BikePathCalculatorStrategy.getInstance();
            case TransportationMode.WALK -> WalkPathCalculatorStrategy.getInstance();
            default -> null;
        };
    }
}
