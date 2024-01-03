package com.redis.Redis.repositories;

import com.redis.Redis.models.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements  UserDao{

    private static final String key = "USER";
    private final RedisTemplate redisTemplate;

    public UserDaoImpl(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public boolean saveUser(User user) {

        try {
            redisTemplate.opsForHash().put(key, user.getId().toString(), user);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return false;
    }

    @Override
    public List<User> fetchAllUsers() {
        return redisTemplate.opsForHash().values(key);
    }
}
