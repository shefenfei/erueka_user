package com.fenfei.springcloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangwet on 2017/9/14 0014.
 */
@Controller
@RequestMapping("/userTest")
public class UserController {

    @ResponseBody
    @RequestMapping("/user")
    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("shefenfei");
        return user;
    }
}
