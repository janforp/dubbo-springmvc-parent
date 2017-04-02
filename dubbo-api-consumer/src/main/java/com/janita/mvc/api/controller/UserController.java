package com.janita.mvc.api.controller;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-04-02 13:50
 */
@Controller
@RequestMapping(value = "/user",method = RequestMethod.GET)
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/get")
    public User getUserById(Long userId){
        return userService.getUserById(userId);
    }
}
