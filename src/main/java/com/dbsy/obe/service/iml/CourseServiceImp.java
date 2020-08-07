package com.dbsy.obe.service.iml;


import com.dbsy.obe.mapper.CourseMapper;
import com.dbsy.obe.pojo.Course;
import com.dbsy.obe.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseServiceImp")
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public int insert(Course record) {
        return this.courseMapper.insert(record);
    }

    @Override
    public int insertSelective(Course record) {
        return this.insertSelective(record);
    }

    @Override
    public Course get(int id) {
        return this.courseMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return this.courseMapper.delete(id);
    }

    @Override
    public int update(Course course) {
        return this.courseMapper.update(course);
    }

    @Override
    public int batchRemove(int[] ids) {
        return this.courseMapper.batchRemove(ids);
    }

    @Override
    public List<Course> getAll() {
        return this.courseMapper.getAll();
    }
}
