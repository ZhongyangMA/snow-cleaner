package com.solarwind;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author Zhongyang MA
 * @Date Dec/10/2020
 */
public class SnowService {

    private String config;

    public SnowService(String config) {
        this.config = config;
    }

    public String getConfigValue() {
        return "The value of 'snow.service.config' is: " + config;
    }
}
