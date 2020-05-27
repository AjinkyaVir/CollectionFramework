package com.company.examplethreearray;

public class Employee {

    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    void diaplayDeatils(){
        System.out.println("Employee Details :: " + "Employee Id : " + empId + " " + "Employee Name : "+ empName);
    }

}
