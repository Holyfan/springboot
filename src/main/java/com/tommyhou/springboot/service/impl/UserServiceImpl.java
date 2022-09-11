package com.tommyhou.springboot.service.impl;

import com.tommyhou.springboot.dao.UserDAO;
import com.tommyhou.springboot.entity.User;
import com.tommyhou.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Holyfan
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    @Override
    public List<User> findUser() {
        return userDao.findAll();
    }
}
