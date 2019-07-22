package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    String deptName;


    //Create constructor

    public Manager(String name, String NI_number, int salary, String deptName){
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    //Add getter method for Department name function

    public String getDeptName(){
        return deptName;
    }

}
