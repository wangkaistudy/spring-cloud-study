package com.github.clay.security.gate;

import com.github.clay.security.auth.client.EnableAceAuthClient;
import com.github.clay.security.gate.utils.DBLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author clay
 * @create 2018/3/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAceAuthClient
@EnableFeignClients({"com.github.clay.security.auth.client.feign","com.github.clay.security.gate.feign"})
public class GatewayServerBootstrap {
    public static void main(String[] args) {
        DBLog.getInstance().start();
        SpringApplication.run(GatewayServerBootstrap.class, args);
    }
}
