package com.prasanth.mvcexample.valueobject;

import com.prasanth.mvcexample.model.Employee;
import com.prasanth.mvcexample.model.Student;

public class EmployeeStudentResponseVO {

    public Employee emp;
    public Student stu;

    @Override
    public String toString() {
        return "EmployeeStudentResponseVO{" +
                "emp=" + emp +
                ", stu=" + stu +
                '}';
    }
}
