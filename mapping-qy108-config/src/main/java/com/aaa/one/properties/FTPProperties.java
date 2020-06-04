package com.aaa.one.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/15 21:47
 * @Description
 */


@Component
@PropertySource("classpath:properties/ftp.properties")
@ConfigurationProperties(prefix = "spring.ftp")
@Data
public class FTPProperties implements Serializable {

    private String host;
    private Integer port;
    private String username;
    private String password;
    private String basePath;
    private String httpPath;

}

