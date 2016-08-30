package com.mapper;

import com.dao.UserDao;
import com.entity.ContentDetailedEntity;
import com.entity.ContentEntity;
import com.entity.ContentExpand;
import com.entity.ContentVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Evilina on 2016/8/18.
 */
public class ContentMapperTest {


    @Test
    public void findContentById() throws Exception {
        ContentMapper contentMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
        System.out.println(contentMapper.findContentById(1));
    }

    @Test
    public void findContentDetailedLazyLoading() {
        ContentMapper contentMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
        List<ContentDetailedEntity> list = contentMapper.findContentDetailedLazyLoading();
        for (ContentDetailedEntity c : list
                ) {
            c.getContentByContentId();
        }
    }

    @Before
    public void setUp() throws Exception {
        if (sqlSessionFactory != null)
        {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("zhixinglejici");
            userMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
        }

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        userMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);

    }
    private SqlSessionFactory sqlSessionFactory;
    private ContentMapper userMapper;
    private UserDao userDao;

    @Test
    public void findContent() throws Exception {
        }

    @Test
    public void findContentByName() throws Exception {
        ContentExpand contentEntity = new ContentExpand();
        contentEntity.setName("ttt");
        ContentVo contentVo = new ContentVo();
        contentVo.setContentExpand(contentEntity);
        System.out.println(userMapper.findContentByName(contentVo));

    }

}