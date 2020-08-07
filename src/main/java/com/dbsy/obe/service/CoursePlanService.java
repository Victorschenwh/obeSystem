package com.dbsy.obe.service;

import com.dbsy.obe.pojo.CoursePlan;

import java.util.List;

public interface CoursePlanService {

    int insert(CoursePlan record);

    int insertSelective(CoursePlan record);

    CoursePlan get(int id);

    int delete(int id);

    int update(CoursePlan coursePlan);

    int batchRemove(int[] ids);

    List<CoursePlan> getAll();
}
