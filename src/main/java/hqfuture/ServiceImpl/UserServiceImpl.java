package hqfuture.ServiceImpl;

import hqfuture.Domain.User;
import hqfuture.Mapper.UserMapper;
import hqfuture.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper Usermapper;

    @Override
    public List<User> loginfunction(User user) {
        List<User> list = this.Usermapper.SelectLogin(user);
        return list;
    }

    @Override
    public int regist(User user) {
        this.Usermapper.Rigistfunction(user);
        return 1;
    }
}
