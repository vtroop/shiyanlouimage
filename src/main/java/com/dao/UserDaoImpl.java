package com.dao;

import com.entity.UserEntity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by Evilina on 2016/8/14.
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    @Override
    public UserEntity findUserById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserEntity userEntity = sqlSession.selectOne("test.findUserById", id);

        //释放资源
        sqlSession.close();
        return userEntity;
    }

    @Override
    public void addUser(UserEntity userEntity) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.insertUser", userEntity);

        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Override
    public void deleteUser(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("test.deleteUser", id);

        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
