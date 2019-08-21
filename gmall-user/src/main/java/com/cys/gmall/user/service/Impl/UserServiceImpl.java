package com.cys.gmall.user.service.Impl;

import com.cys.gmall.user.bean.UserMember;
import com.cys.gmall.user.mapper.UserMapper;
import com.cys.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JunA
 * @create 2019-08-20 19:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserMember> getAllUser() {
        return userMapper.selectAll();
    }
}
