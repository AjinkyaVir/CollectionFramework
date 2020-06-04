package com.company.vector.exampleone.examplethree;

import java.util.Iterator;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(30);
        for (int i=0 ; i<=30 ; i++){
            vector.add(i);
        }
        System.out.println(vector);
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()){
           Integer i = iterator.next();
           if (i/2 != 0){
               System.out.println(vector);
           }
        }


    }

}
