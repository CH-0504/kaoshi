package com.test.demo;//import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan({
        "com.test.demo.dao.mapper"
})
@SpringBootApplication
/*
@EntityScan({
        "com.test.demo.domain.*"
})*/
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
