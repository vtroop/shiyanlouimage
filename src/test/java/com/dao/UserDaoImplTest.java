package com.dao;

import com.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by Evilina on 2016/8/14.
 */
public class UserDaoImplTest {
    @Before
    public void setUp() throws Exception {
        if (sqlSessionFactory == null)
        {
            InputStream inputStream = Resources.getResourceAsStream("sqlMapCondig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("zhixinglejici");
            userDao = new UserDaoImpl(sqlSessionFactory);

        }
    }
    private SqlSessionFactory sqlSessionFactory;
    private UserDao userDao;

    @Test
    public void findUserById() throws Exception {
        userDao.findUserById(1);
    }

    @Test
    public void addUser() throws Exception {
        userDao.addUser(new UserEntity("lili","xixi"));
    }

    @Test
    public void deleteUser() throws Exception {
        userDao.deleteUser(7);
    }

}