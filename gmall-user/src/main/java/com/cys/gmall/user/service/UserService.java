package com.cys.gmall.user.service;

import com.cys.gmall.user.bean.UserMember;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JunA
 * @create 2019-08-20 19:40
 */

public interface UserService {
    List<UserMember> getAllUser();
}
