package bank.otdel;
import bank.BankOffice;
import bank.Bank;
import uslugi.Credit;
import people.sotrudnik.Sotrudnik;
import people.client.Client;
import java.util.Scanner;
public class OtdelCredit extends OtdelConstruct {

    private Sotrudnik specialist;
    private Client client;

    public OtdelCredit(String otedelName, int rabotnik) {//Конструктор для Отдела Кредитов//
        super(otedelName,rabotnik);
        specialist = new Sotrudnik("Сотрудник","Консультант отдела кредитования","Иванов","Иван","Иванович");
    }

    public Client getCreditClient(){
        client = new Client("Клиент","Сидоров","Митрич","Апполосович", 35,1500);
        return client;
    }

    public Credit vidatCredit() {
        Client client = getClient();
        Sotrudnik specialis = getSpecialist();
        int dohod = client.getDohod();
        int vozrast = client.getVozrast();
        if ((dohod>1000)&(vozrast>20)) {
            Credit credit = new Credit(5, 10);//создание объекта класса Credit с введенными параметрами//
            System.out.println(specialis.getFamilia()+" "+specialis.getName()+" "+specialis.getPatronymic()+" выдал кредит.");
            System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
            System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
        } else {
            System.out.println("Сотрудник "+specialis.getFamilia()+" "+specialis.getName()+" "+specialis.getPatronymic()+" отказал в кредите");
        }
        return null;
    }

    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}

    public Sotrudnik getSpecialist() {return specialist;}
    public void setSpecialist(Sotrudnik specialist) { this.specialist = specialist; }


}