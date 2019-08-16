package com.github.clay.security.gate.config;

import com.github.clay.security.gate.handler.RequestBodyRoutePredicateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author clay
 * @create 2019/1/27.
 */
@Configuration
public class GatewayConfig {
    @Bean
    RequestBodyRoutePredicateFactory requestBodyRoutePredicateFactory() {
        return new RequestBodyRoutePredicateFactory();
    }
}
