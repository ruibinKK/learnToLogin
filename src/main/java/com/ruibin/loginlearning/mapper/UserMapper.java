package com.ruibin.loginlearning.mapper;

import com.ruibin.loginlearning.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getUserById(int id);
    User checkPassword(@Param("username")String username,@Param("password") String password);
    int addUser(@Param("username") String username, @Param("password") String password);
}
