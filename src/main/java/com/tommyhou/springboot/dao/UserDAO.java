package com.tommyhou.springboot.dao;

import com.tommyhou.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Holyfan
 */

public interface UserDAO extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();
}
