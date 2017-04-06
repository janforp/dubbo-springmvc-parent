package com.janita.mvc.api.controller;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-04-02 13:50
 */
@Controller
@RequestMapping("/user")
@ResponseBody
@Api(value = "/user-consumer",description = "消费者中的接口")
public class ConsumeUserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询user")
    public User getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

    @PutMapping
    @ApiOperation(value = "添加用户user")
    public User addUser(@ApiParam(value = "添加用户的数据") @RequestBody User user){
        return userService.addUser(user);
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/{id}")
    public User deleteUser(@ApiParam(value = "删除用户的id") @PathVariable("id") Long userId){
        return userService.deleteUser(userId);
    }

    @PostMapping
    @ApiOperation(value = "修改用户")
    public User updateUser(@ApiParam(value = "修改用户的数据") @RequestBody User user){
        return userService.updateUser(user);
    }

}
