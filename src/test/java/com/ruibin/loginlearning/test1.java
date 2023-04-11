package com.ruibin.loginlearning;

import com.ruibin.loginlearning.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test1 {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void check(){
        userMapper.addUser("ruibin","1234");
        System.out.println(userMapper.getUserById(1));
        System.out.println(userMapper.checkPassword("ruibin", "1234"));
    }
}
