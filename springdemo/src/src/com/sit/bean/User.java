package com.sit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by 3 on 2017/9/26.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    private String id;
    @Column(name = "uname")
    private String uname;
    @Column(name = "password")
    private String password;
    @Column(name = "sec")
    private String sex;
    public User(){

    }
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getUname() {
        return uname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
