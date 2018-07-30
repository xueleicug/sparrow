package com.xl.framework.cache;

public interface RedisCache extends Cache {

    public void expire(String key, int seconds);

    public void expireAt(String key, long timeStamp);

    public void put(String key, Object value, int seconds);
}
