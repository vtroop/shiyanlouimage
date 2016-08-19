package com.dao;

import com.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by Evilina on 2016/8/14.
 */


public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    @Override
    public UserEntity findUserById(int id) throws Exception {
//没有整合spring        SqlSession sqlSession = sqlSessionFactory.openSession();
//        整合spring
        SqlSession sqlSession = this.getSqlSession();
        UserEntity userEntity = sqlSession.selectOne("com.mapper.UserMapper.findUserById", id);

        //释放资源,方法结束，spring管理后会自动释放资源，也可以注释掉，因为可以自动释放
        //sqlSession.close();
        return userEntity;
    }

    @Override
    public void addUser(UserEntity userEntity) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        sqlSession.delete("test.insertUser", userEntity);

        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteUser(int id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();

        sqlSession.delete("test.deleteUser", id);

        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
