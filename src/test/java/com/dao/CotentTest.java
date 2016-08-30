package com.dao;

import com.BaseJunit4Test;
import com.entity.ContentExpand;
import com.entity.ContentVo;
import com.mapper.ContentMapper;
import com.mapper.UserMapper;
import com.service.impl.ContentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Evilina on 2016/8/29.
 */
public class CotentTest extends BaseJunit4Test {
    @Autowired
    private ContentMapper userMapper;

    @Test
    public void find() {
        ContentExpand contentEntity = new ContentExpand();
        contentEntity.setName("ttt");
        ContentVo contentVo = new ContentVo();
        contentVo.setContentExpand(contentEntity);
        System.out.println(userMapper.findContentByName(contentVo));
    }
}
