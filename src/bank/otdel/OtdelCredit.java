package bank.otdel;
import uslugi.Credit;
public class OtdelCredit extends OtdelConstruct {
        public OtdelCredit (String name,int rabotnik){//Конструктор для Отдела Кредитов//
        this.name = name;
        this.rabotnik = rabotnik;
        }
         public void getCredit(){
            Credit credit = new Credit(5,10 );//создание объекта класса Credit с введенными параметрами//
        }
}
