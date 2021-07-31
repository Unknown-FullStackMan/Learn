package com.simple.springbootmybatis.mapper;

import com.simple.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author Simple
 * @data 2021/3/29 20:53
 */

@Mapper
public interface    UserMapper {
    User Sel(int id);
}
