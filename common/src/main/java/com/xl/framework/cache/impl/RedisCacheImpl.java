package com.xl.framework.cache.impl;

import com.xl.framework.cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class RedisCacheImpl implements RedisCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void expire(String key, int seconds) {
        redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
    }

    @Override
    public void expireAt(String key, long timeStamp) {
        redisTemplate.expireAt(key, new Date(timeStamp));
    }

    @Override
    public Object get(String key) {
        Object value = redisTemplate.opsForValue().get(key);
        return value;
    }

    @Override
    public void put(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public void put(String key, Object value, int seconds) {
        redisTemplate.opsForValue().set(key, value, seconds);
    }

    @Override
    public boolean exists(String key) {
        return redisTemplate.opsForValue().get(key) == null ? false : true;
    }

    @Override
    public void remove(String key) {
        redisTemplate.delete(key);
    }
}
