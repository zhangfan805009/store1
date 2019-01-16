package com.chinasoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.entity.Student;


public interface IStudentMapper {

	@Select("select * from student where stuNo = #{stuNo}")
	Student queryStudent(int stuNo);
	@Insert("insert into student (stuNo,stuName,stuAge) values (#{stuNo},#{stuName},#{stuAge})")
	void insertStudent(Student stu);
}
