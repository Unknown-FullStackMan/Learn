package com.simple.springbootmybatis.pojo;

import lombok.Data;

/**
 * @author Simple
 * @data 2021/3/29 20:49
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

}
