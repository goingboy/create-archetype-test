package cn.bugstack.controller;

import cn.bugstack.entity.User;
import cn.bugstack.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private IUserService userService;

    @PostMapping("/login")
    public User login(String username, String password) {
        return userService.findByUsernameAndPassword(username, password);
    }
}
