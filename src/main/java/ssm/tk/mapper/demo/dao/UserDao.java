package ssm.tk.mapper.demo.dao;

import ssm.tk.mapper.demo.model.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author Lanye
 * @Date 2019/7/3 23:35
 * @Version 1.0
 **/
public interface UserDao extends Mapper<User> {

    String selectRolesByName(String name);

}
