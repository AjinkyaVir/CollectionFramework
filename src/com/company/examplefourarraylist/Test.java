package com.company.examplefourarraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        /* provided type safety to the collection by using Generics*/

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(101,"Ajinkya"));
        employees.add(new Employee(102,"Sayali"));

        for (Employee e: employees
             ) {
            System.out.println(e.empId + " " + e.empName);
        }


    }

}
