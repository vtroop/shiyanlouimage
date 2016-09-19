package com;

import com.gen.entity.Content;
import com.gen.mapper.ContentDetailedMapper;
import com.gen.mapper.ContentMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Evilina on 2016/9/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations = {"/mybatis/spring-mybatis-maven-test.xml"}) //加载配置文件
public class BaseTestMapper {

    private ContentMapper contentMapper;
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test2() {
        contentMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
        Content content = new Content();
        content.setTitle("你好");
        content.setUrl("1");
        content.setUrlMd5("2");
        contentMapper.insert(content);
    }
    @Test
    public void test4() {
        contentMapper = sqlSessionFactory.openSession().getMapper(ContentMapper.class);
        System.out.println(contentMapper.selectByPrimaryKey(2));
    }


    @Test
    public void test3() {
        ContentDetailedMapper contentDetailedMapper = sqlSessionFactory.openSession().getMapper(ContentDetailedMapper.class);
        System.out.println(contentDetailedMapper.selectByPrimaryKey(2));
    }
}
