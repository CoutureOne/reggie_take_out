package com.couture;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@Slf4j
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching //开启Spring Cache注解方式是缓存功能
public class ReggieTakeOutApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieTakeOutApplication.class, args);
        log.info("项目启动成功~");
    }
}
