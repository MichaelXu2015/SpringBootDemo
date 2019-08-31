package com.example.demo06.mapper;

import com.example.demo06.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xuchao
 * @date 2019-08-31 -15:37
 **/
@Mapper
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    int insertEmp(Employee employee);
}
