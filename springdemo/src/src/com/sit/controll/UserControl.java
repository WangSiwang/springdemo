package com.sit.controll;


import com.sit.bean.User;
import com.sit.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 3 on 2017/9/26.
 */


@Controller
@RequestMapping("/user")
public class UserControl {

    private Logger logger = Logger.getLogger(this.getClass());

    @Resource(name = "UserService")
    private UserService userservice;

    public Map<String,Object> find(User user, HttpServletRequest request){
        Map<String,User> map = new HashMap<String, User>();
        System.out.println("UserControl.find");
        System.out.println("user = [" + user + "], request = [" + request + "]");



        return null;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("UserControl.success");
        return "success";
    }

}
