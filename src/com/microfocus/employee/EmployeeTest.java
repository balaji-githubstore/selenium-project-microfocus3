package com.microfocus.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.companyName);
        System.out.println(Employee.companyLocation);

        Employee.companyName="MicroFocus";
        Employee.companyLocation="Chennai";

        System.out.println(Employee.companyName);
        System.out.println(Employee.companyLocation);

        Employee emp1=new Employee(1001);
        Employee emp2=new Employee();
        Employee emp3=new Employee(1002,"john");
        Employee emp4=new Employee();
        Employee emp5=Employee.getEmployeeInstance();

//        emp1.empId=-101;
        emp1.empName="Saul";
        emp1.empSalary=9000;
        emp1.empPerformance="A";

//        emp2.empId=102;
        emp2.empName="Kim";
        emp2.empSalary=8000;
        emp2.empPerformance="B";

//        emp3.empId=103;
        emp3.empName="Ken";
        emp3.empSalary=5000;
        emp3.empPerformance="C";

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();

        emp3.checkBonus();
        emp2.checkBonus();
        emp1.checkBonus();

        Employee e=Employee.getEmployeeInstance();

        Employee emp6=new Employee();
        Employee emp7=Employee.getEmployeeInstance();

        Employee.printCurrentEmployeeId(emp6);

        Employee.printCurrentEmployeeId(emp7);

        Employee.printCurrentEmployeeId(Employee.getEmployeeInstance());
    }
}
