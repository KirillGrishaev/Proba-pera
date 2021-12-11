package people.base;

public class Chelovek{
    public String type;//определение индивида как Клиента или Сотрудника
    public String dolznost;
    public String fio;
    public int vozrast;// атрибут Клиента для оценки решения по заявке на услугу (напр. Ипотека)
    public int dohod; //аналогичено Возрасту//
    public Chelovek(String type,String fio, int vozrast, int dohod){//конструктор для создания people.base.Chelovek типа Gost (Клиент назван Гостем)
        this.type = type;
        this.vozrast = vozrast;
        this.dohod = dohod;
        this.fio = fio;
    }

    public Chelovek(String type, String dolznost){//конструктор для создания people.base.Chelovek типа Sotrundnik
        this.type = type;
        this.dolznost = dolznost;}
    }