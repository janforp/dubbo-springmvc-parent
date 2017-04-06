package com.janita.mvc.user.service;

import com.janita.mvc.common.bean.User;
import com.janita.mvc.common.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Janita on 2017-04-02 13:48
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    private static final Map<Long,User> userMap = new HashMap<Long, User>();

    public User getUserById(Long userId) {
        return userMap.get(userId);
    }

    public User updateUser(User user) {
        Long userId = user.getUserId();
        userMap.put(userId,user);
        return user;
    }

    public User deleteUser(Long userId) {
        User user = userMap.get(userId);
        userMap.remove(userId);
        return user;
    }

    public User addUser(User user) {
        userMap.put(user.getUserId(),user);
        return user;
    }
}
