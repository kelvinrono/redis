package com.redis.Redis.repositories;

import com.redis.Redis.models.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUsers();
}
