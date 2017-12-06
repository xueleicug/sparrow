package com.xl.framework.cache.impl;

import com.xl.framework.cache.EhCache;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

@Component
public class EhCacheImpl implements EhCache {

    @Autowired
    private Cache ehCache;

    @Override
    public Object get(String key) {
        Object value = null;
        Element e = ehCache.get(key);
        if (e != null) {
            value = e.getObjectValue();
        }
        return value;
    }

    @Override
    public void put(String key, Object value) {
        Element e = new Element(key, value);
        ehCache.put(e);
    }

    @Override
    public boolean exists(String key) {
        return ehCache.get(key) != null ? true : false;
    }

    @Override
    public void remove(String key) {
        ehCache.remove(key);
    }

    @Override
    public void removeAll() {
        ehCache.removeAll();
    }

    @Override
    public List<String> getAllKeys() {
        return null;
    }

    @Override
    public void expire(String key, int seconds) {
        Element e = ehCache.get(key);
        if (e != null) {
            e.setTimeToLive(seconds);
        }
    }

    @Override
    public void expireAt(String key, long timestamp) {
        Element e = ehCache.get(key);
        if (e != null) {
            long millseconds = timestamp - new Date().getTime();
            int second = (int)(millseconds / 1000);
            e.setTimeToLive(second);
        }
    }

    @Override
    public int timeToLive(String key) {
        Element e = ehCache.get(key);
        int timeToLive = 0;
        if (e != null) {
            timeToLive = new Long((e.getExpirationTime() - System.currentTimeMillis() / 1000)).intValue();
        }
        return timeToLive;
    }

    @Override
    public void setTimeToIdle(String key, int seconds) {
        ehCache.getKeysWithExpiryCheck();
    }
}
