package id.codecorn.userservice.controller;

import id.codecorn.userservice.entity.User;
import id.codecorn.userservice.service.UserService;
import id.codecorn.userservice.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable("id") Long userId) {
        return userService.getUserWithDepartment(userId);
    }

}
