package com.xl.framework.cache;

import java.util.List;

public interface EhCache extends Cache {

    public void removeAll();

    public List<String> getAllKeys();

    public void expire(String key, int seconds);

    public void expireAt(String key, long timestamp);

    public int timeToLive(String key);

    public void setTimeToIdle(String key, int seconds);
}
