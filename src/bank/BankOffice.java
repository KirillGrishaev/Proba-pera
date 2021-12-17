package bank;
import people.client.Client;
import people.sotrudnik.Sotrudnik;
import bank.otdel.OtdelCredit;
import uslugi.Credit;


class BankOffice extends Bank {
    private Sotrudnik vasia;
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
                "Кидаем круглосуточно!");//создание Офиса
        OtdelCredit otdelCredit = new OtdelCredit("отд",3,new Sotrudnik("Сотрудник","Специалист отдела кредитования"));//получаем в офисе созданный Отдел с сотрудником внутри//
        Credit credit = otdelCredit.vidatCredit();
        Sotrudnik vasia = otdelCredit.vasiaOdobril();

        //Получаем обратно созданный объект типа Кредит//
        //System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
        //System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита//


    }

}
