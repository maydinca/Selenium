package RecapJava.__003_Inheritance;

public class Manager extends Employee{
    private int sorumluOlduguKisiSayisi;
    public Manager(String name, String department, int id,int sorumluOlduguKisiSayisi) {
        super(name, department, id);
        this.sorumluOlduguKisiSayisi=sorumluOlduguKisiSayisi;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("sorumlu oldugum kisi sayisi "+this.sorumluOlduguKisiSayisi);
    }


    public void maasZammi(int miktarinda){
        System.out.println("Sorumlu oldugu kisilere "+ miktarinda+ " $ zam yapildi");
    }
}
