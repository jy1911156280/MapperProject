package com.aaa.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.aaa.one.staticstatus.RequestURLProperties.PACKAGE_CONTROLLER_URL;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/16 8:25
 * @Description
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()// 选择swagger具体生效的接口是什么？(service, controller, mapper)
                .apis(RequestHandlerSelectors.basePackage(PACKAGE_CONTROLLER_URL))
                .paths(PathSelectors.any())
                .build();

    }

    /**
     * @author hhy
     * @description
     *    构建了整个项目的一些描述信息
     * @param: []
     * @date 2020/5/16 8:30
     * @return springfox.documentation.service.ApiInfo
     * @throws 
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测绘管理系统")
                .description("某市的测绘管理系统")
                .contact(new Contact("hhy", "http://www.hhy.com", "1378489182@qq.com"))
                .version("1.0")
                .build();
    }
}
