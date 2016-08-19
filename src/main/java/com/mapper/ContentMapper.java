package com.mapper;

import com.entity.ContentDetailedEntity;
import com.entity.ContentEntity;

import java.util.List;

/**
 * Created by Evilina on 2016/8/16.
 */
public interface ContentMapper {
    public List<ContentEntity> findContent();

    public List<ContentEntity> findContentByName(ContentEntity contentEntity);

    public ContentEntity findContentById(int id);

    public List<ContentDetailedEntity> findContentDetailedLazyLoading();
}
