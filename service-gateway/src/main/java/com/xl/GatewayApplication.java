package com.xl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringCloudApplication
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {

        SpringApplicationBuilder app = new SpringApplicationBuilder(GatewayApplication.class);
        app.web(true);
        app.bannerMode(Banner.Mode.CONSOLE);
        app.run();
        log.info("^_^ ####################################### ^_^");
        log.info("^_^ ### Gateway Application was started ### ^_^");
        log.info("^_^ ####################################### ^_^");
    }

}
