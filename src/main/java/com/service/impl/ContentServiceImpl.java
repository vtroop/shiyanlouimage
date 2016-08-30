package com.service.impl;

import com.entity.ContentEntity;
import com.entity.ContentVo;
import com.mapper.ContentMapper;
import com.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Evilina on 2016/8/23.
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<ContentEntity> findContentByName(ContentVo contentVo) throws Exception {
        return contentMapper.findContentByName(contentVo);
    }
}
