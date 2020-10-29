package com.test.demo.service;

import com.test.demo.domain.User;

import java.util.List;

/**
 * @author lch
 * @date 2020/10/29 14:24
 */
public interface UserService {

    List<User> getUserList(int page ,int limit);


}
