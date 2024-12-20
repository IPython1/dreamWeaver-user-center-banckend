package com.dyj.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dyj.usercenter.model.User;
import com.dyj.usercenter.service.UserService;
import com.dyj.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author IPython
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-11-10 13:04:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




