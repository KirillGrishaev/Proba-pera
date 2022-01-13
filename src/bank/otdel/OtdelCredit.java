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

    public Credit vidatCredit() {
        Client[] base = client.getClientBaseArray();
        Sotrudnik specialis = getSpecialist();
        for (int i=0; i<base.length; i++){
            Credit credit = new Credit(1, 1);
            int dohod = client.getDohod();
            int vozrast = client.getVozrast();
            if (10000 >= dohod ){
                System.out.println("Сотрудник "+specialis.getFamilia()+" "+specialis.getName()+" "+specialis.getPatronymic()+" отказал в кредите");
                            }
            else{ if ((10000 <=dohod)&&(dohod >= 100000)){
                credit.setProcent(5);
            }
            else {
                credit.setProcent(10);
                if (18<=vozrast){
                    if ((18<=vozrast)&&(vozrast<=30)){
                        credit.setTime(10);
                        System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
                        System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
                    }
                    else{
                        credit.setTime(5);
                        System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
                        System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
                    }
                    }
                }
            }

        }
        return null;
    }

    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}

    public Sotrudnik getSpecialist() {return specialist;}
    public void setSpecialist(Sotrudnik specialist) { this.specialist = specialist; }


}