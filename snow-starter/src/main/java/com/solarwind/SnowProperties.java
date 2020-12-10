package com.solarwind;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/10/2020
 */
@Data
@ConfigurationProperties("snow.service")
public class SnowProperties {
    private String config;  // snow.service.config=xxx
}
