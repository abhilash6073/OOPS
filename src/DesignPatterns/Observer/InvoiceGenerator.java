package DesignPatterns.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(){
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Invoice");
        System.out.println("Invoice is being generated");
        return data;
    }
}
