package ticketsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import ticketsystem.model.User;
import ticketsystem.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("userLogin")
    public User UserLogin(@RequestBody User user){
        return userService.userLogin(user.getUsername(),user.getPassword());
    }

    /**
     * 注册   改密
     * @param user
     * @return
     */
    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
