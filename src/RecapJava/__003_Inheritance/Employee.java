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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("bilgiler");
        System.out.println("isim : "+this.name);
        System.out.println("depatment :"+this.department);
        System.out.println("salary : "+this.salary);
    }

}
