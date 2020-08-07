package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.CoursePointMapper;
import com.dbsy.obe.pojo.CoursePoint;
import com.dbsy.obe.service.CoursePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("CoursePointServiceImp")
public class CoursePointServiceImp implements CoursePointService {

    @Autowired
    CoursePointMapper coursePointMapper;

    @Override
    @Transactional
    public int insert(CoursePoint record) {
        return coursePointMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(CoursePoint record) {
        return coursePointMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return coursePointMapper.listCount(map);
    }

    @Override
    public List<CoursePoint> list(Map map) {
        return coursePointMapper.list(map);
    }

    @Override
    public CoursePoint get(int id) {
        return coursePointMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return coursePointMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(CoursePoint coursePoint) {
        return coursePointMapper.update(coursePoint);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return coursePointMapper.batchRemove(ids);
    }

    @Override
    public List<CoursePoint> getAll() {
        return coursePointMapper.getAll();
    }
}
