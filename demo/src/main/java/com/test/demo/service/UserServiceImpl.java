package com.test.demo.service;

import com.test.demo.dao.mapper.UserMapper;
import com.test.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lch
 * @date 2020/10/29 14:25
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUserList(int page, int limit) {

        if (page == 0){
            page = 1;
        }
        if (limit == 0){
            limit = 20;
        }
        int page1 = (page-1)*limit;



        List<User> userList = userMapper.getUserList(page1, limit);


        return userList;
    }
}
