package ru.job4j.javacodebased;

public class Canary {
    private String name;

    public Canary(String name) {
        this.name = name;
        System.out.println("Canary init with name " + name);
    }

    public String getName() {
        return name;
    }
}
