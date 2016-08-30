package com.service;

import com.entity.ContentEntity;
import com.entity.ContentVo;

import java.util.List;

/**
 * Created by Evilina on 2016/8/23.
 */
public interface ContentService {
    public List<ContentEntity> findContentByName(ContentVo contentVo) throws Exception;

}
