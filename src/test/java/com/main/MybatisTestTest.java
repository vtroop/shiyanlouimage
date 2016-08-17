package com.main;

import com.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evilina on 2016/8/13.
 */
public class MybatisTestTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void insertUser() {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("sqlMapCondig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //UserEntity u = sqlSession.selectOne("test.findUserById", 1);
        //List<UserEntity> list = sqlSession.selectList("test.findUserByName","ming");
        //System.out.println(list);
        UserEntity userEntity = new UserEntity("xiaobai", "123");
        sqlSession.insert("test.insertUser", userEntity);
        System.out.println(userEntity);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() throws Exception {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("sqlMapCondig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //UserEntity u = sqlSession.selectOne("test.findUserById", 1);
        //List<UserEntity> list = sqlSession.selectList("test.findUserByName","ming");
        //System.out.println(list);
        UserEntity userEntity = new UserEntity("xiaobai", "123");
//        sqlSession.insert("test.insertUser", userEntity);
//        System.out.println(userEntity);
        sqlSession.delete("deleteUser", 9);
        sqlSession.commit();
        sqlSession.close();
    }
}