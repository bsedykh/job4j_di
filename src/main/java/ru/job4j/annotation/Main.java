package ru.job4j.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var man = context.getBean(Man.class);
        man.print();
        context.close();
    }
}
