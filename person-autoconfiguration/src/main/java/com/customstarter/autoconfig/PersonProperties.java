package com.customstarter.autoconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 增加额外的配置类来获取配置，保持person module只是单纯的类声明
 */
@ConfigurationProperties(prefix = "person")//该注解只是数据绑定，需要注册为Bean还需要额外的配置
@Data
public class PersonProperties {
    private String name;
    private int age;
}
