package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.CoursePlanMapper;
import com.dbsy.obe.pojo.CoursePlan;
import com.dbsy.obe.service.CoursePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("coursePlanServiceImp")
public class CoursePlanServiceImp implements CoursePlanService {

    @Autowired
    private CoursePlanMapper coursePlanMapper;

    @Override
    public int insert(CoursePlan record) {
        return this.coursePlanMapper.insert(record);
    }

    @Override
    public int insertSelective(CoursePlan record) {
        return this.coursePlanMapper.insertSelective(record);
    }

    @Override
    public CoursePlan get(int id) {
        return this.coursePlanMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return this.coursePlanMapper.delete(id);
    }

    @Override
    public int update(CoursePlan coursePlan) {
        return this.coursePlanMapper.update(coursePlan);
    }

    @Override
    public int batchRemove(int[] ids) {
        return this.coursePlanMapper.batchRemove(ids);
    }

    @Override
    public List<CoursePlan> getAll() {
        return this.coursePlanMapper.getAll();
    }
}
