package com.service.impl;

import com.gen.entity.Content;
import com.gen.mapper.ContentMapper;

import com.service.NewContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Evilina on 2016/9/12.
 */

@Service
public class NewContentServiceImpl implements NewContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return contentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Content record) {
        return contentMapper.insert(record);
    }

    @Override
    public int insertSelective(Content record) {
        return contentMapper.insertSelective(record);
    }

    @Override
    public Content selectByPrimaryKey(Integer id) {
        return contentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Content record) {
        return contentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Content record) {
        return contentMapper.updateByPrimaryKeySelective(record);
    }
}
