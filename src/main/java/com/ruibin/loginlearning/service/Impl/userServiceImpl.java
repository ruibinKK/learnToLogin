package com.ruibin.loginlearning.service.Impl;

import com.ruibin.loginlearning.mapper.UserMapper;
import com.ruibin.loginlearning.pojo.User;
import com.ruibin.loginlearning.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User checkPassword(String username, String password) {
        return userMapper.checkPassword(username,password);
    }

    @Override
    public int addUser(String username, String password) {
        return userMapper.addUser(username,password);
    }
}
