package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.DepartmentMapper;
import com.dbsy.obe.pojo.Department;
import com.dbsy.obe.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("departmentServiceImp")
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    @Transactional
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return departmentMapper.listCount(map);
    }

    @Override
    public List<Department> list(Map map) {
        return departmentMapper.list(map);
    }

    @Override
    public Department get(int id) {
        return departmentMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return departmentMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Department department) {
        return departmentMapper.update(department);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return departmentMapper.batchRemove(ids);
    }

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }
}
