package com.gen.mapper;

import com.gen.entity.ContentDetailed;
import com.gen.entity.ContentDetailedWithBLOBs;

public interface ContentDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContentDetailedWithBLOBs record);

    int insertSelective(ContentDetailedWithBLOBs record);

    ContentDetailedWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContentDetailedWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ContentDetailedWithBLOBs record);

    int updateByPrimaryKey(ContentDetailed record);
}