package ru.job4j.javacodebased;

import jakarta.annotation.PreDestroy;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
        System.out.println("Dog init with name " + name);
    }

    public Dog() {
        System.out.println("Dog init");
    }

    public String getName() {
        return name;
    }


    public void postConstruct() {
        System.out.println("bean Dog method postConstruct()");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}
