package com.mapper;

import com.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by Evilina on 2016/8/14.
 */
public class UserMapperTest {
    @Before
    public void setUp() throws Exception {
        if (sqlSessionFactory == null)
        {
            InputStream inputStream = Resources.getResourceAsStream("sqlMapCondig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("zhixinglejici");
            userMapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
        }
    }
    private SqlSessionFactory sqlSessionFactory;
    private UserMapper userMapper;
    private UserDao userDao;

    @Test
    public void findUserById() throws Exception {
        System.out.println(userMapper.findUserById(1));
    }

    @Test
    public void insertUser() throws Exception {

    }

    @Test
    public void deleteUser() throws Exception {

    }

}