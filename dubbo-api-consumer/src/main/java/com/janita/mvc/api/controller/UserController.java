package com.janita.mvc.api.controller;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Janita on 2017-04-02 13:50
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }
}
