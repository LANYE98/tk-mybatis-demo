package ssm.tk.mapper.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ssm.tk.mapper.demo.dao.UserDao;
import ssm.tk.mapper.demo.model.User;
import ssm.tk.mapper.demo.service.UserService;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Lanye
 * @Date 2019/7/3 23:48
 * @Version 1.0
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private @Autowired UserDao userDao;

    @Override
    public int insert(User user) {
        if (StringUtils.isEmpty(user.getId())) {
            user.setId(UUID.randomUUID().toString());
        }
        return userDao.insert(user);
    }

    @Override
    public String selectRolesByName(String name) {
        return userDao.selectRolesByName(name);
    }

    @Override
    public List<User> list() {
        return userDao.selectAll();
    }
}
