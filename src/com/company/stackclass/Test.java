package com.company.stackclass;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        /*
        * Stack Class : is a child class of Vector
        * Introduce in Version 1.0
        * Synchronized
        * Stack class - Last In First Out
        *
        * */

        Stack<String> stack = new Stack<>();
        stack.push("Aju"); // To enter a element in stack
        stack.push("Sau");
        stack.push("Durga");
        System.out.println(stack);
        stack.pop(); // to remove the element
        System.out.println(stack);
        System.out.println(stack.isEmpty()); // To check stack is empty or not
        System.out.println(stack.peek()); // return first element
        stack.clear(); // To clear stack
        System.out.println(stack.empty());

    }

}
