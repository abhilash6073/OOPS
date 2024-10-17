package DesignPatterns.Observer;

public class CashbackGenerator implements OrderPlacedSubscriber{

    public CashbackGenerator(){
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Cashback");
        System.out.println("Cashback generated for customer");
        return data;
    }
}
