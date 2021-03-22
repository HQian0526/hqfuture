package hqfuture.Mapper;

import hqfuture.Domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //根据账号密码查询数据库（用于登录）
    public List<User> SelectLogin(User user);

    //向数据库中添加用户
    public List<User> Rigistfunction(User user);
}
