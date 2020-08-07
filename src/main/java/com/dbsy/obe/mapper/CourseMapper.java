package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Clazz;
import com.dbsy.obe.pojo.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);

    @Select("select * from course where id = #{id}")
    Course get(int id);

    @Delete("delete from course where id = #{id}")
    int delete(int id);

    @Update("update course set name=#{name},number=#{number},department_id=#{departmentId}  where id=#{id}")
    int update(Course course);

    int batchRemove(int[] ids);

    @Select("select * from course")
    List<Course> getAll();
}