package com.simple.springbootmybatis.service;

import com.simple.springbootmybatis.mapper.UserMapper;
import com.simple.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Simple
 * @data 2021/3/29 20:51
 */


@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }


}
