package com.example.demo06.controller;

import com.example.demo06.bean.Department;
import com.example.demo06.bean.Employee;
import com.example.demo06.mapper.DepartmentMapper;
import com.example.demo06.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuchao
 * @date 2019-08-31 -15:16
 **/
@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return departmentMapper.getDepartment(id);
    }


    @RequestMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDepartment(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }





}
