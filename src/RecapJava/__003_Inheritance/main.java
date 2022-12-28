package RecapJava.__003_Inheritance;

public class main {
    public static void main(String[] args) {

    Employee employee=new Employee("Mehmet","Bilisim",30000);
    employee.showInfo();

        System.out.println("-------------");

        Manager manager =new Manager("Mehmet","Hukuk",40000,10);
        manager.showInfo();
        manager.maasZammi(60);
}
}
