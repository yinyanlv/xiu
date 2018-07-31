package com.bugong.xiu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bugong.xiu.entity.User;
import com.bugong.xiu.dao.UserDao;

@Service
public class UserService {

    @Autowired
    private UserDao<User> userDao;

    public List<User> getAllUsers() {
        return userDao.queryAll();
    }
}
