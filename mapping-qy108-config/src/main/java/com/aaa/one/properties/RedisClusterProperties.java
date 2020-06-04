package com.aaa.one.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 21:59
 * @Description
 */
@Component
@PropertySource("classpath:properties/redis_cluster.properties")
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisClusterProperties {

    private String nodes;
    private Integer maxAttempts;
    private Integer commandTimeout;

}
