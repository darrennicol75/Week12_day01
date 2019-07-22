package Staff.Management;


public class Director extends Manager {

    //Add private budget
    private double budget;

    //Add constructor

    public Director(String name, String NI_number, int salary, String deptName, double budget) {
        super(name, NI_number, salary, deptName);
        this.budget = budget;
    }

    //Add getter for budget

    public double getBudget() {
        return budget;
    }

}
