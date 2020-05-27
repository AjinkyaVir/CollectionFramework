package com.company.examplethreearray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        //Accept data from keyboard
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //create Employee object with size 5
        Employee[] employee = new Employee[5];

        //store 5 employee data into the array
        for (int i=0 ; i<5; i++){
            System.out.println("Enter employee id: ");
            int id = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter employee name: ");
            String name = bufferedReader.readLine();

            employee[i] = new Employee(id,name);
        }

        System.out.println("Employee Data is : ");

        //Display employee data from array

        for (int i=0; i<employee.length; i++){
            employee[i].diaplayDeatils();
        }


    }
}
