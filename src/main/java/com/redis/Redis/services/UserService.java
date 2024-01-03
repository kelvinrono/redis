package com.redis.Redis.services;

import com.redis.Redis.models.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUsers();
}
