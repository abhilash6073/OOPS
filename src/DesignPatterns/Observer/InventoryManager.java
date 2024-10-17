package DesignPatterns.Observer;

public class InventoryManager implements OrderPlacedSubscriber{

    public InventoryManager(){
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Inventory updated");
        System.out.println("Inventory is being updated");
        return data;
    }
}
