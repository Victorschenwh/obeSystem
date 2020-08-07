package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.ClazzMapper;
import com.dbsy.obe.pojo.Clazz;
import com.dbsy.obe.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("clazzServiceImp")
public class ClazzServiceImp implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public int insert(Clazz record) {
        return this.clazzMapper.insert(record);
    }

    @Override
    public int insertSelective(Clazz record) {
        return this.clazzMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return this.clazzMapper.listCount(map);
    }

    @Override
    public List<Clazz> list(Map map) {
        return this.clazzMapper.list(map);
    }

    @Override
    public Clazz get(int id) {
        return this.clazzMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return this.clazzMapper.delete(id);
    }

    @Override
    public int update(Clazz clazz) {
        return this.clazzMapper.update(clazz);
    }

    @Override
    public int batchRemove(int[] ids) {
        return this.clazzMapper.batchRemove(ids);
    }

    @Override
    public List<Clazz> getAll() {
        return this.clazzMapper.getAll();
    }
}
