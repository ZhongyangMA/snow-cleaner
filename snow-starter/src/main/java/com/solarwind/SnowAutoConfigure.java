package com.solarwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/10/2020
 */
@Configuration
@ConditionalOnClass(SnowService.class)
@EnableConfigurationProperties(SnowProperties.class)
public class SnowAutoConfigure {

    @Autowired
    private SnowProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "snow.service", value = "enabled", havingValue = "true")
    SnowService starterService (){
        return new SnowService(properties.getConfig());
    }

}
