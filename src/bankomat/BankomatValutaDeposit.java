package bankomat;

public class BankomatValutaDeposit extends Bankomat {

    public BankomatValutaDeposit(int numOfBankomat, String typeOfBankomat, int quantityOfMoney, int[] spisokOfAccount, String receipt) {
        super(numOfBankomat, typeOfBankomat, quantityOfMoney, spisokOfAccount, receipt);
    }

    public int changeToRouble() {
        int a = 75;
        int b = getQuantityOfMoney();
        return a * b;
    }
}
