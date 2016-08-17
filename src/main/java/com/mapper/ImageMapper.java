package com.mapper;

import com.entity.ImageMybatis;

import java.util.List;

/**
 * Created by Evilina on 2016/8/16.
 */
public interface ImageMapper {
    public List<ImageMybatis> findImageById();
}
