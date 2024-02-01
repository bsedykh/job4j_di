package ru.job4j.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru/job4j/lifecycle");
        System.out.println("------------");
        context.close();
    }
}
