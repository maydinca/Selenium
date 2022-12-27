package RecapJava.__003_Inheritance;

public class Employee {
    // bir klasin baska bir klasin ozelliklerini, fieldslarini, metholarini, ozelliklerini miras almasidir

    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.salary = id;
    }

    public void showInfo(){
        System.out.println("bilgiler");
        System.out.println("isim : "+this.name);
        System.out.println("depatment :"+this.department);
        System.out.println("salary : "+this.salary);
    }

}
