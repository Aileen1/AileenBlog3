package service;

import dao.UserDao;
import module.User;

/**
 * Created by Administrator on 2017/5/30.
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String name){
        return userDao.login(name);
    }
}
