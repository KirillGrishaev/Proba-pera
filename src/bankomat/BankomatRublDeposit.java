package bankomat;

public class BankomatRublDeposit extends Bankomat {
    private String money;

    public BankomatRublDeposit(int numOfBankomat, String typeOfBankomat, int quantityOfMoney, int[] spisokOfAccount, String receipt, String money) {
        super(numOfBankomat, typeOfBankomat, quantityOfMoney, spisokOfAccount, receipt);
        this.money = money;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
