package com.sit.dao;

import com.sit.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 根据姓名查询信息
     * @param uname
     * @return
     */
    public User findByUserName(@Param(value = "uname") String uname);

    /**
     * 获得用户
     * @param user
     * @return
     */
    public List<User> findUser(User user);

    /**
     * 增加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 删除用户
     * @param user
     */
    public void deleteUser(User user);
}
