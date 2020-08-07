package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.RequirementMapper;
import com.dbsy.obe.pojo.Requirement;
import com.dbsy.obe.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("requirementServiceImp")

public class RequirementServiceImp implements RequirementService {
    @Autowired
    RequirementMapper requirementMapper;

    @Override
    @Transactional
    public int insert(Requirement record) {
        return requirementMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Requirement record) {
        return requirementMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return requirementMapper.listCount(map);
    }

    @Override
    public List<Requirement> list(Map map) {
        return requirementMapper.list(map);
    }

    @Override
    public Requirement get(int id) {
        return requirementMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return requirementMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Requirement requirement) {
        return requirementMapper.update(requirement);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return requirementMapper.batchRemove(ids);
    }

    @Override
    public List<Requirement> getAll() {
        return requirementMapper.getAll();
    }
}

