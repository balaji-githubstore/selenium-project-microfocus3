package com.microfocus.employee;

public class Employee {
    private int empId;
    public String empName;
    public double empSalary;
    public String empPerformance;

    public static String companyName;
    public static String companyLocation;
    private static int counter=101;

    public Employee()
    {
        System.out.println("Object Created!!");
        System.out.println("Launch Browser!!");

        empId=counter;
        counter=counter+1;
    }

    public Employee(int empId)
    {
        this.empId=empId;
    }

    public Employee(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    public Employee(String name,int id)
    {
        empId=id;
        empName=name;
    }

    public void displayEmployeeDetails() {
        System.out.println("--------------------------");
        System.out.println(this);
        System.out.println(this.empId);
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Performance: " + empPerformance);
        System.out.println("Company Name: " + Employee.companyName);
        System.out.println("Company Location: " + Employee.companyLocation);
        System.out.println("--------------------------");
    }

    public void checkBonus() {
        if (empPerformance.equals("A")) {
            System.out.println("Bonus - 1000 for " + empName);
        } else if (empPerformance.equals("B")) {
            System.out.println("Bonus - 500 for " + empName);
        } else {
            System.out.println("No Bonus for " + empName);
        }
    }

    public static Employee getEmployeeInstance()
    {
        Employee e=new Employee();
        return e;
    }

    public static void printCurrentEmployeeId(Employee a)
    {
        System.out.println(a.empId);
    }
}
