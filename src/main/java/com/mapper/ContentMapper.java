package com.mapper;

import com.entity.ContentDetailedEntity;
import com.entity.ContentEntity;
import com.entity.ContentVo;

import java.util.List;

/**
 * Created by Evilina on 2016/8/16.
 */
public interface ContentMapper {
    public List<ContentEntity> findContent();

    public List<ContentEntity> findContentByName(ContentVo contentVo);

    public ContentEntity findContentById(int id);

    public List<ContentDetailedEntity> findContentDetailedLazyLoading();
}
