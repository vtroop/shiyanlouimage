package com.mapper;

import com.entity.UserEntity;

/**
 * Created by Evilina on 2016/8/13.
 */
public interface UserMapper {


//    //查找
    public UserEntity findUserById(int id) throws Exception;
//
//    //创建
    public void InsertUser(UserEntity userEntity) throws Exception;
//
//    //删除
    public void deleteUser(int id) throws Exception;

}
