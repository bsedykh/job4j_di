package ru.job4j.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru.job4j.annotation")
public class Config {
    @Bean
    @Primary
    @Order(3)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Order(2)
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    @Order(1)
    public Dog someDog() {
        return new Dog("SomeDog");
    }
}
