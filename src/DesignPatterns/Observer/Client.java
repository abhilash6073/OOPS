package DesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a  = Amazon.getInstance();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryManager inventoryManager = new InventoryManager();
        CashbackGenerator cashbackGenerator = new CashbackGenerator();
        a.orderPlaced();
        a.deRegisterOrderPlacedSubscriber(customerNotifier);
        System.out.println("------customer notifier deregistered------");
        a.orderPlaced();
    }
}
