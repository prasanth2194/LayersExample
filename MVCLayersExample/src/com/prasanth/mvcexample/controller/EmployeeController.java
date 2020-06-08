package com.prasanth.mvcexample.controller;

import com.prasanth.mvcexample.service.EmployeeService;
import com.prasanth.mvcexample.service.StudentService;
import com.prasanth.mvcexample.valueobject.EmployeeStudentResponseVO;

import java.util.List;

public class EmployeeController {

    EmployeeService empService = new EmployeeService();
    StudentService stuService = new StudentService();


    public List<EmployeeStudentResponseVO> getEmployeeWhoAreStudents() {
        return empService.getEmployeeStudents();
    }

    public EmployeeStudentResponseVO getEmployeeStudentDetailsById(Integer empId) {
        return null;
    }
}
