package bugstack.controller;

import cn.bugstack.entity.User;
import cn.bugstack.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

public class LoginController {

    @Resource
    private IUserService userService;

    @PostMapping("/login")
    public User login(String username, String password) {
        return userService.findByUsernameAndPassword(username, password);
    }
}
