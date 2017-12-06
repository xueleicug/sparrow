package com.xl.framework.cache;

import java.util.Set;

public interface Cache {

    public Object get(String key);

    public void put(String key, Object value);

    public boolean exists(String key);

    public void remove(String key);

}
