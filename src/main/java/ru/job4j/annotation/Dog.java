package ru.job4j.annotation;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet<Dog> {
    private String name = "Dog";

    public Dog() {
        System.out.printf("Dog default init: %s%n", name);
    }

    public Dog(String name) {
        this.name = name;
        System.out.printf("Dog init: %s%n", name);
    }

    @Override
    public String print() {
        return "Dog name = %s".formatted(name);
    }
}
