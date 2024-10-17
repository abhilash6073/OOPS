package DesignPatterns.Adapter;

public interface BankAPIAdapter {

    public String transfer(String fromUserName, String toUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenticate(String userName);


}
