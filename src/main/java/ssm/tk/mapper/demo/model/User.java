package ssm.tk.mapper.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description TODO
 * @Author Lanye
 * @Date 2019/7/3 23:36
 * @Version 1.0
 **/
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private String id;
    private String name;
    private String roles;

}
