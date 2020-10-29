package com.test.demo.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.test.demo.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lch
 * @date 2020/10/29 14:22
 */

public interface UserMapper extends BaseMapper<User> {

    List<User> getUserList(@Param("page") int page ,@Param("limit") int limit);

}
