package bankomat;

public class Bankomat {

    private int numOfBankomat;
    private String typeOfBankomat;
    private int quantityOfMoney;
    private int[] spisokOfAccount;
    private String receipt;

    public Bankomat(int numOfBankomat, String typeOfBankomat, int quantityOfMoney, int[] spisokOfAccount, String receipt) {
        this.numOfBankomat = numOfBankomat;
        this.typeOfBankomat = typeOfBankomat;
        this.quantityOfMoney = quantityOfMoney;
        this.spisokOfAccount = spisokOfAccount;
        this.receipt = receipt;
    }

    public int getNumOfBankomat() {
        return numOfBankomat;
    }

    public void setNumOfBankomat(int numOfBankomat) {
        this.numOfBankomat = numOfBankomat;
    }

    public String getTypeOfBankomat() {
        return typeOfBankomat;
    }

    public void setTypeOfBankomat(String typeOfBankomat) {
        this.typeOfBankomat = typeOfBankomat;
    }

    public int getQuantityOfMoney() {
        return quantityOfMoney;
    }

    public void setQuantityOfMoney(int quantityOfMoney) {
        this.quantityOfMoney = quantityOfMoney;
    }

    public int[] getSpisokOfAccount() {
        return spisokOfAccount;
    }

    public void setSpisokOfAccount(int[] spisokOfAccount) {
        this.spisokOfAccount = spisokOfAccount;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }
}
