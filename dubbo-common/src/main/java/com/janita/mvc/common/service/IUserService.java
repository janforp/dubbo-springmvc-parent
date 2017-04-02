package com.janita.mvc.common.service;

import com.janita.mvc.common.bean.User;

/**
 * Created by Janita on 2017-04-02 13:42
 */
public interface IUserService {

    User getUserById(Long userId);
}
