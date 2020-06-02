package com.company.examplenineconversionprocess;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // Conversion of arrays to collection

        String[] s = {"aa","bb","cc"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(s));
        arrayList.add("aju");
        arrayList.add("sau");
        System.out.println(arrayList);

        //conversion of generic collection to arrays

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Aju");
        a2.add("Sau");

        String[] s1 = new String[a2.size()];
        a2.toArray(s1);

        for (String ss:s1
             ) {
            System.out.println(ss);
        }

        //Conversion of normal collection to arrays
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Rupa");
        arrayList1.add(10);

        Object[] o = arrayList1.toArray();
        for (Object oo:o
             ) {
            System.out.println(oo);
        }



    }



}
