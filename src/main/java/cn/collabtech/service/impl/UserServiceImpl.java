package cn.collabtech.service.impl;

import cn.collabtech.dao.IUserDao;
import cn.collabtech.model.User;
import cn.collabtech.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}