package com.xl.config;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class GuavaCacheConfig {

    @Value("${spring.guava.expire}")
    private long expireTime = 60 * 5;

    @Value("${spring.guava.maxSize}")
    private long maxSize = 100;

    @Bean
    public Cache<String, Object> getGuavaCache() {
        Cache<String, Object> guavaCache = CacheBuilder.newBuilder()
                .expireAfterAccess(expireTime, TimeUnit.SECONDS)
                .maximumSize(maxSize).build();
        return guavaCache;
    }
}
