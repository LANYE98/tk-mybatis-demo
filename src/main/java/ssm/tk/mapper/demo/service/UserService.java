package ssm.tk.mapper.demo.service;

import ssm.tk.mapper.demo.model.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Lanye
 * @Date 2019/7/3 23:47
 * @Version 1.0
 **/
public interface UserService {

    int insert(User user);

    String selectRolesByName(String name);

    List<User> list();

}
