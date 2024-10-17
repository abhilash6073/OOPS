package DesignPatterns.Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe() {
        bankAPIAdapter = new ICICIBankAdapter(); // in case phonepe now needs to change the bank from ICICI to yesbank or back,
        // they can just make the change here.
        // In case they introduce a new bank, again they just need to create a bank adapter and make the change here
    }

    public String transferMoney(String fromUserName, String toUserName, double amount){
        String result = bankAPIAdapter.transfer(fromUserName, toUserName, (int)amount);
        return result;
    }

    public double checkBalance(String userName){
        return bankAPIAdapter.checkBalance(userName);
    }

    public boolean login(String userName){
        return bankAPIAdapter.authenticate(userName);
    }
}
