package com.microfocus.oops;

abstract class Employee
{
    public String empName;
    public String empType;
    public void displayName(){
        System.out.println("name of employee");
    }

    public abstract double caculateSalary();
}
class PermanentEmployee extends Employee{

    public double caculateSalary() {
        return 30*300;
    }
}
class ContractEmployee extends Employee{
    public double caculateSalary(){
        return 8*250;
    }
}

public class Demo2Test {
    public static void main(String[] args) {


        Employee e=new PermanentEmployee();
        e.empName="John";
        e.displayName();
        e.caculateSalary();

        e=new ContractEmployee();
        e.empName="Peter";
        e.displayName();
        e.caculateSalary();
    }

}
