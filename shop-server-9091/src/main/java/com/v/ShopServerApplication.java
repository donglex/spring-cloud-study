package com.v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
@RestController
public class ShopServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopServerApplication.class, args);
    }

    @RequestMapping("api/shop/hello")
    public String hello() {
        return "商品服务:  \"success!\"";
    }
}
