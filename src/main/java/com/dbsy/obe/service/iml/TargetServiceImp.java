package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.TargetMapper;
import com.dbsy.obe.pojo.Target;
import com.dbsy.obe.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("targetServiceImp")
public class TargetServiceImp implements TargetService {
    @Autowired
    TargetMapper targetMapper;

    @Override
    @Transactional
    public int insert(Target record) {
        return targetMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Target record) {
        return targetMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return targetMapper.listCount(map);
    }

    @Override
    public List<Target> list(Map map) {
        return targetMapper.list(map);
    }

    @Override
    public Target get(int id) {
        return targetMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return targetMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Target target) {
        return targetMapper.update(target);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return targetMapper.batchRemove(ids);
    }

    @Override
    public List<Target> getAll() {
        return targetMapper.getAll();
    }
}
