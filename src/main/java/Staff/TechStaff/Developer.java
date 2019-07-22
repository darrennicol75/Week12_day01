package Staff.TechStaff;

import Staff.Employee;

public class Developer extends Employee {

    //Add in department Name as it is not available in the employee parent class

    String deptName;

    // Add Constructor

    public Developer(String name, String NI_number, int salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    // Add Getter

    public String getDeptName(){
        return deptName;
    }

}
