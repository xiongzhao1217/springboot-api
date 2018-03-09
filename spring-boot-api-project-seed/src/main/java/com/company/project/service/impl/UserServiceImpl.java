package com.company.project.service.impl;

import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/06.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Object test() {
        User user = new User();
        user.setUsername("6@qq.com");
        user.setNickName("土豆-6");
        userMapper.deleteByPrimaryKey(1);
//        userMapper.updateByCondition();
        return userMapper.selectCount(user);
    }

    @Override
    public Object test2() {
        User user = new User();
        user.setUsername("5@qq.com");
        user.setNickName("土豆-5");
//        userMapper.updateByCondition();
        return userMapper.selectOne(user);
    }

}
