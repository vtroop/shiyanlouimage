package com.service;

import com.gen.entity.Content;

/**
 * Created by Evilina on 2016/9/12.
 */
public interface NewContentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}
