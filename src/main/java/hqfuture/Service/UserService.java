package hqfuture.Service;

import hqfuture.Domain.User;

import java.util.List;

public interface UserService {

    //登录验证
    public List<User> loginfunction(User user);

    //注册
    public int regist(User user);
}
