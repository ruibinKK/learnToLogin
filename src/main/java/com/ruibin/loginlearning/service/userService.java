package com.ruibin.loginlearning.service;

import com.ruibin.loginlearning.pojo.User;
import org.springframework.stereotype.Service;


public interface userService {
    User getUserById(Integer id);
    User checkPassword(String username,String password);
    int addUser(String username,String password);
}
