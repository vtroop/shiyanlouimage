package com.mapper;

import com.dao.UserDao;
import com.entity.ContentEntity;
import com.entity.ImageMybatis;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Evilina on 2016/8/16.
 */
public class ImageMapperTest {
    @Before
    public void setUp() throws Exception {
        if (sqlSessionFactory == null)
        {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("zhixinglejici");
            userMapper = sqlSessionFactory.openSession().getMapper(ImageMapper.class);
        }
    }
    private SqlSessionFactory sqlSessionFactory;
    private ImageMapper userMapper;
    private UserDao userDao;

    @Test
    public void findImageById() throws Exception {

        List<ImageMybatis> list =  userMapper.findImageById();
        System.out.println(list);
    }

    @Test
    public void findContent() {
        ContentMapper contentMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
//        System.out.println(contentMapper);
        List<ContentEntity> list = contentMapper.findContent();
        System.out.println(list);
    }


}