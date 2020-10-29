package com.test.demo.controller;

import com.test.demo.domain.User;
import com.test.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lch
 * @date 2020/10/29 14:41
 */

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("getUserList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页数"),
            @ApiImplicitParam(name = "limit",value = "个数")
    })
    public List<User> getUserList(@RequestParam("page") int page,@RequestParam("limit") int limit){
        return userService.getUserList(page, limit);
    }


}
