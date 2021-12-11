package bank;
import people.client.Client;
import people.sotrudnik.Sotrudnik;
import bank.otdel.OtdelCredit;
class BankOffice extends Bank {
    private static OtdelCredit otdelCredit;
    String adress;
    String typeOffice; //круглосуточный, либо имеет часы работы//

    public BankOffice(String name, String adress, String typeOffice) {//Конструктор для создания офиса//
        this.name = name;
        this.adress = adress;
        this.typeOffice = typeOffice;
    }

    public static void main(String[] args) {
        BankOffice kidok = new BankOffice(
                "Кидала Банк",
                "Три девятое царство, г. Урюпинск, улица Щипачей,д.13",
                "Кидаем круглосуточно!");
        otdelCredit = new OtdelCredit("Отдел кредитования", 3);
        otdelCredit.getCredit();


        Client test = new Client("Клиент", "Буратино", 100, 500);// тестовый вывод объекта подкласса Клиент//
        Sotrudnik rabotnik = new Sotrudnik("Сотрудник", "Консультант"); // тестовый вывод объекта подкласса Сотрудник//
    }

}
