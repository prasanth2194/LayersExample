package com.prasanth.mvcexample.client;

import com.prasanth.mvcexample.controller.EmployeeController;

public class Main {

    public static void main(String[] args) {

        // this is browser or another class or any client

        EmployeeController control = new EmployeeController();

        // printing the response
        System.out.println(control.getEmployeeWhoAreStudents());
    }
}
