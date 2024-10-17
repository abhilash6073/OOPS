package DesignPatterns.Adapter;

public class ICICIBankAdapter implements BankAPIAdapter{

    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }


    @Override
    public String transfer(String fromUserName, String toUserName, double amount) {
        long fromUserId = returnIdFromUsername(fromUserName);
        long toUserId = returnIdFromUsername(toUserName);
        return iciciBankAPI.doPayment(fromUserId, toUserId, amount);
    }

    @Override
    public double checkBalance(String userName) {
        return iciciBankAPI.balance(returnIdFromUsername(userName));
    }

    @Override
    public boolean authenticate(String userName) {
        return iciciBankAPI.checkUser(returnIdFromUsername(userName));
    }

    private long returnIdFromUsername(String userName){
        return 0;
    }
}
