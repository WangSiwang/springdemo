package com.sit.service;

import com.sit.bean.User;

import java.util.List;

/**
 * Created by 3 on 2017/9/26.
 */

public interface UserService {

    /**
     * findByUanme
     * @param uname
     * @return
     */
    public User findByUname(String uname);

    /**
     * findAll
     * @param user
     * @return
     */
    public List<User> findAll(User user);

    /**
     * add
     * @param user
     */
    public void add(User user);

    /**
     * delete
     * @param user
     */
    public void delete(User user);

}
