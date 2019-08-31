package com.example.demo06.mapper;

import com.example.demo06.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author xuchao
 * @date 2019-08-31 -15:11
 **/
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDepartment(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDepartment(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDepartment(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    int updateDepartment(Department department);
}
