package DesignPatterns.Adapter;

public class YesBankAdapter implements BankAPIAdapter{

    public YesBankAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = new YesBankAPI();
    }

    private YesBankAPI yesBankAPI;

    @Override
    public String transfer(String fromUserName, String toUserName, double amount) {
        char result = yesBankAPI.transfer(fromUserName, toUserName, (int)amount);
        if (result == 'D'){
            return "Success";
        }
        else return "Failure";
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenticate(String userName) {
        return yesBankAPI.authenticate(userName) == 'Y';
    }
}
