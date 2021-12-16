package people.base;

public class Chelovek{
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public int getDohod() {
        return dohod;
    }

    public void setDohod(int dohod) {
        this.dohod = dohod;
    }

    public String getDolznost() {
        return dolznost;
    }

    public void setDolznost(String dolznost) {
        this.dolznost = dolznost;
    }

    private String type;//определение индивида как Клиента или Сотрудника
    private String fio;
    private int vozrast;
    private int dohod;
    private String dolznost;
    public Chelovek(String type,String fio, int vozrast, int dohod){//конструктор для создания people.base.Chelovek типа Client (Клиент назван Гостем)
        this.fio = fio;
        this.vozrast = vozrast;
        this.dohod = dohod;
        this.type = type;
    }

    public Chelovek(String type, String dolznost){//конструктор для создания people.base.Chelovek типа Sotrundnik
        this.dolznost = dolznost;
        this.type = getType();
    }
    }