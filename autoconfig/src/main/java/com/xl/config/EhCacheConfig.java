package com.xl.config;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class EhCacheConfig {

    public static final String CACHE_NAME = "ehcache";

    public static final String EHCACHE_CONF_NAME = "/ehcache.xml";

    @Bean
    public CacheManager getCacheManaget() {
        URL url = EhCacheConfig.class.getResource(EHCACHE_CONF_NAME);
        CacheManager cacheManager = CacheManager.create(url);
        return cacheManager;
    }

    @Bean
    public Cache getEhCache(CacheManager cacheManager) {
        Cache ehCache = cacheManager.getCache(CACHE_NAME);
        if(ehCache == null) {
            cacheManager.addCache(CACHE_NAME);
            ehCache = cacheManager.getCache(CACHE_NAME);
        }
        return ehCache;
    }

}
