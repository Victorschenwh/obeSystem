package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Course;
import com.dbsy.obe.pojo.CoursePlan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CoursePlanMapper {
    int insert(CoursePlan record);

    int insertSelective(CoursePlan record);

    @Select("select * from course_plan where id = #{id}")
    CoursePlan get(int id);

    @Delete("delete from course_plan where id = #{id}")
    int delete(int id);

    @Update("update course_plan set course_id=#{courseId},plan_id=#{planId},total_hours=#{total_hours},theory_hours=#{theory_hours},experiment_hours=#{experiment_hours},credit=#{credit},study_term=#{study_term} where id=#{id}")
    int update(CoursePlan coursePlan);

    int batchRemove(int[] ids);

    @Select("select * from course_plan")
    List<CoursePlan> getAll();
}