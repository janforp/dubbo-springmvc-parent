package com.janita.mvc.user.service;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-04-02 13:48
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Override
    public User getUserById(Long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUsername("来自dubbo-user-provider项目的user");
        return user;
    }
}
