package cn.collabtech.dao;


import cn.collabtech.model.User;

public interface IUserDao {

    User selectUser(long id);

}