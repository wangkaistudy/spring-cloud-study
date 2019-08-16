package com.github.clay.security.auth.client.configuration;

import com.github.clay.security.auth.client.config.ServiceAuthConfig;
import com.github.clay.security.auth.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clay on 2017/9/15.
 */
@Configuration
@ComponentScan({"com.github.clay.security.auth.client","com.github.clay.security.auth.common.event"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
