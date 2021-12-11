package uslugi;

public class Credit {
    private int procent; //процентная ставка кредита//
    private int time; // срок кредита
    public Credit(int procent, int time){//Конструктор для объектов типа Кредит//
        this.procent = procent;
        this.time = time;
        System.out.println("Процентная ставка:"+procent+"%");//вывод на экран процента кредита, созданного в OtdelCredit//
        System.out.println("Срок кредита: "+time+" лет");//вывод на экран срока кредита, созданного в OtdelCredit//
    }
    }

