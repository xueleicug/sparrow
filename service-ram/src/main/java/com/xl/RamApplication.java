package com.xl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class RamApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(RamApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
        log.info("^_^ #################################### ^_^");
        log.info("^_^ ### Ram Application was started #### ^_^");
        log.info("^_^ #################################### ^_^");
    }
}
