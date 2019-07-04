package ssm.tk.mapper.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ssm.tk.mapper.demo.model.User;
import ssm.tk.mapper.demo.service.UserService;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Lanye
 * @Date 2019/7/4 10:39
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    private @Autowired UserService userService;

    @GetMapping()
    public List<User> list() {
        return userService.list();
    }

    @PostMapping()
    public String create(User user) {
        return (userService.insert(user) > 0) ? "OK" : "ERROR";
    }

    @GetMapping("/roles")
    public String getRolesById(String name) {
        return userService.selectRolesByName(name);
    }

}
