package Staff;

public abstract class Employee {

    String name;
    String NI_number;
    int salary;

    public Employee(String name, String NI_number, int salary){
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNI_number(){
        return NI_number;
    }

    public int getSalary(){
        return salary;
    }

    public int getBonus(){
        return salary -= salary * 0.99;
    }

    public int getSalaryRaise(double raise){
        return salary += salary * raise;
    }

}
