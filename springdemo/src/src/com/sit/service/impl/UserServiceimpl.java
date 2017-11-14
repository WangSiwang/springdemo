package com.sit.service.impl;

import com.sit.bean.User;
import com.sit.dao.UserDao;
import com.sit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 3 on 2017/9/26.
 */
@Service(value = "UserService")
public class UserServiceimpl implements UserService {

    @Resource(name = "UserDao")
    UserDao userDao;

    @Override
    public List<User> findAll(User user) {
        return userDao.findUser(user);
    }

    @Override
    public User findByUname(String uname) {
        return userDao.findByUserName(uname);
    }

    @Override
    public void add(User user) {
        userDao.addUser(user);
    }

    @Override
    public void delete(User user) {
        userDao.deleteUser(user);
    }
}
