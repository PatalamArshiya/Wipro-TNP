package IOStreams.MiniProject;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + empAge + " " + empSalary;
    }
}