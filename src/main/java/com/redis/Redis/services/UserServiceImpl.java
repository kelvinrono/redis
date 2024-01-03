package com.redis.Redis.services;

import com.redis.Redis.models.User;
import com.redis.Redis.repositories.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.UserTransactionAdapter;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUsers() {
        return userDao.fetchAllUsers();
    }
}
