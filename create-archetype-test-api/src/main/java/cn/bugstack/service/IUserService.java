package cn.bugstack.service;

import cn.bugstack.entity.User;

public interface IUserService {

    User findByUsernameAndPassword(String username, String password);
}
