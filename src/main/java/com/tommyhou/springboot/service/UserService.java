package com.tommyhou.springboot.service;

import com.tommyhou.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Holyfan
 */
@Service
public interface UserService {

    /**
     * 查询user
     * @return user的list
     */
    List<User> findUser();
}
