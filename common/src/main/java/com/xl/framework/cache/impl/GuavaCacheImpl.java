package com.xl.framework.cache.impl;

import com.xl.framework.cache.GuavaCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuavaCacheImpl implements GuavaCache {

    @Autowired
    private com.google.common.cache.Cache<String, Object> guavaCache;

    @Override
    public Object get(String key) {
        Object value = guavaCache.getIfPresent(key);
        return value;
    }

    @Override
    public void put(String key, Object value) {
        guavaCache.put(key, value);
    }

    @Override
    public boolean exists(String key) {
        return guavaCache.getIfPresent(key) != null ? true : false;
    }

    @Override
    public void remove(String key) {
        guavaCache.invalidate(key);
    }

    @Override
    public void removeAll() {
        guavaCache.invalidateAll();
    }
}
