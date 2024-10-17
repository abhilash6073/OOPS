package DesignPatterns.Observer;

public class CustomerNotifier implements OrderPlacedSubscriber{

    public CustomerNotifier(){
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }


    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Notify the customer regarding order placed");
        System.out.println("Notify the customer regarding order placed");
        return data;
    }
}
