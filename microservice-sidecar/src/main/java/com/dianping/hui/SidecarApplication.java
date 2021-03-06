package com.dianping.hui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lanxinyu@meituan.com  2018-12-04 1:24 PM
 * @Description:
 */
@SpringBootApplication
/**
 * 整合组件
 * @EnableCircuitBreaker
 * @EnableZuulProxy
 */
@EnableSidecar
public class SidecarApplication {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(SidecarApplication.class, args);
    }
}
