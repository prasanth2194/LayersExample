package com.prasanth.mvcexample.service;

import com.prasanth.mvcexample.dao.EmployeeDAO;
import com.prasanth.mvcexample.model.Employee;
import com.prasanth.mvcexample.valueobject.EmployeeStudentResponseVO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    StudentService stuServ = new StudentService();

    EmployeeDAO empDao = new EmployeeDAO();

    public List<EmployeeStudentResponseVO> getEmployeeStudents() {
        List<Employee> employeesWhoAreStudents = empDao.getEmployeeStudents();
        List<EmployeeStudentResponseVO> result = new ArrayList<>();
        for (Employee empS : employeesWhoAreStudents) {
            // populate response object
            EmployeeStudentResponseVO obj = new EmployeeStudentResponseVO();
            // setting the employee
            obj.emp = empS;
            // setting the student
            // we dont have student details. But we have student Id.
            // So I can ask student service to give me student details using the id I have.
            // I can also ask student dao. But I let my service talk to another service first rather than dao directly.
            obj.stu = stuServ.getStudentByStudentId(empS.sid);
            // add this employee to result list
            result.add(obj);
        }
        // return list of result objects
        return result;
    }

    public EmployeeStudentResponseVO getEmployeeStudentById(Integer empId) {
        return null;
    }
}
