package com.janita.mvc.user.controller;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Janita on 2017-04-05 20:20
 */
@Controller
@RequestMapping("/user")
@ResponseBody
@Api(value = "/user-provider",description = "提供者中的接口")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询user")
    public User getUser(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

}
