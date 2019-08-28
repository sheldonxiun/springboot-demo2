package io.xiun.springboot;

import io.xiun.springboot.dbconfig.DBConfig1;
import io.xiun.springboot.dbconfig.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
//@MapperScan(basePackages = {"io.xiun.springboot.mapper"})
//@ComponentScan(basePackages = {"io.xiun.springboot.datasource", "io.xiun.springboot.web", "io.xiun.springboot.test1.service", "io.xiun.springboot.test2.service"})
@ComponentScan(basePackages = {"io.xiun.springboot"})
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }
}
