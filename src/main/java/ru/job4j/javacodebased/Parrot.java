package ru.job4j.javacodebased;

public class Parrot {
    private String name;

    public Parrot(String name) {
        this.name = name;
        System.out.println("Parrot init with name = " + name);
    }

    public String getName() {
        return name;
    }
}
