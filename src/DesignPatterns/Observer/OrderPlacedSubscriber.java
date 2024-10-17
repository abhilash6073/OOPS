package DesignPatterns.Observer;

public interface OrderPlacedSubscriber { //structure of subscriber
    ReturnData orderPlaceEvent(); // action that we need to perform when an order place event is consumed


//any class that wants to become a subscriber for order placed event [wants to consume order place event
    // needs to implement the OrderPlacedSubscriber interface


}
