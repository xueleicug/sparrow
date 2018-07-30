package com.xl.framework.cache;

public interface Cache {

    public Object get(String key);

    public void put(String key, Object value);

    public boolean exists(String key);

    public void remove(String key);

}
