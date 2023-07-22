package com.wayne.springcloud.consumer_feign;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@OpenAPIDefinition(info = @Info(title = "Consumer", version = "1.0.0", description = "消費者項目"))
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
public class ConsumerFeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignOrder80Application.class, args);
    }

}
