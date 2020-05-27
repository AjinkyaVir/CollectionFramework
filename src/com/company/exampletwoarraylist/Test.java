package com.company.exampletwoarraylist;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Employee(101,"Ajinkya"));
        arrayList.add(new Student(1,"Sayali"));
        arrayList.add("Aju");
        arrayList.add(10);
        arrayList.add(null);
        System.out.println(arrayList.toString());

        /* OutPut
        [com.company.exampletwoarraylist.Employee@1540e19d, com.company.exampletwoarraylist.Student@677327b6, Aju, 10, null]
        */

        for (Object o: arrayList) {

            /* instanceof operator is used to check the type of the object
            *
            * syntax : ref-var instanceof class-name
            *
            * output: class-name@hahcode
            *
            *  */

            if (o instanceof Employee){
                Employee employee = (Employee) o;
                System.out.println(employee.eId + " " + employee.eName);
            }
            if (o instanceof Student){
                Student student = (Student) o;
                System.out.println(student.sId + " " + student.sName);
            }
            if (o instanceof Integer){
                System.out.println(o);
            }
            if (o instanceof String){
                System.out.println(o);
            }
            if (o == null){
                System.out.println(o);
            }
        }


    }

}
