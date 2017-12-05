package com.xl.framework.cache;

import java.util.Set;

public interface Cache {

    public void expire(String key, int seconds);

    public void expireAt(String key, long timeStamp);

    public Object get(String key);

    public void put(String key, Object value);

    public void put(String key, Object value, int seconds);

    public boolean exists(String key);

    public void remove(String key);

}
