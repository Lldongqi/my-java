package com.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.mapper")
public class GameApplication implements ApplicationRunner {
    public static void main(String[] args) {
        System.out.println("容器开始启动。。。。。。。。。");
        SpringApplication.run(GameApplication.class,args);
        System.out.println("容器启动成功。。。。。。。。。");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner 方法开始启动");
    }
}
