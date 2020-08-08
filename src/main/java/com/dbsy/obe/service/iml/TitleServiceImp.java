package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.TitleMapper;
import com.dbsy.obe.pojo.Title;
import com.dbsy.obe.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("titleServiceImp")
public class TitleServiceImp implements TitleService {
    @Autowired
    TitleMapper titleMapper;

    @Override
    @Transactional
    public int insert(Title record) {
        return titleMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Title record) {
        return titleMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return titleMapper.listCount(map);
    }

    @Override
    public List<Title> list(Map map) {
        return titleMapper.list(map);
    }

    @Override
    public Title get(int id) {
        return titleMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return titleMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Title title) {
        return titleMapper.update(title);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return titleMapper.batchRemove(ids);
    }

    @Override
    public List<Title> getAll() {
        return titleMapper.getAll();
    }
}
