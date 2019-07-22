package Staff.TechStaff;

import Staff.Employee;

public class DatabaseAdmin extends Employee {

    String deptName;

    //Add constructor

    public DatabaseAdmin(String name, String NI_number, int salary, String deptName) {
        super(name, NI_number, salary);
        this.deptName = deptName;
    }

    // Add Getter

    public String getDeptName(){
        return deptName;
    }
}
