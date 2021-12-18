package bank.otdel;
import uslugi.Credit;
import people.sotrudnik.Sotrudnik;
import people.client.Client;
import java.util.Scanner;
public class OtdelCredit extends OtdelConstruct {
    private Sotrudnik vasia;
    private double dohod;
    Scanner scanner = new Scanner(System.in);

    public Sotrudnik getVasia() {
        return vasia;
    }

    public OtdelCredit(String otedelName, int rabotnik) {//Конструктор для Отдела Кредитов//
        this.otdelName = otdelName;
        this.rabotnik = rabotnik;
        vasia = new Sotrudnik("Сотрудник", "Специалист отдела кредитования");
    }
    public Credit vidatCredit() {
        Credit credit = new Credit(5, 10);//создание объекта класса Credit с введенными параметрами//
        return credit;
    }
    public Sotrudnik vasiaOdobril() {//Сотрудник одобряет заявку//
        System.out.println("Введите доход клиента: ");
        Credit credit = vidatCredit();
        int dohod = scanner.nextInt();
        if (dohod < 1000) {
            System.out.println("Сотрудник Василий отказал в кредите");
        } else {
            System.out.println("Сотрудник Василий выдал кредит.");
            System.out.println("Срок кредита: "+credit.getTime()+" лет");//Вывод на экран параметров Кредита//
            System.out.println("Процентная ставка: "+credit.getProcent()+" %");//Вывод на экран параметров Кредита
        }
        return null;
    }
}