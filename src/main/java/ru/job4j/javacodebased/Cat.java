package ru.job4j.javacodebased;

public class Cat {
    private String name;
    private Cat() {
        System.out.println("Cat init");
    }

    public static Cat createCat(String name) {
        Cat cat = new Cat();
        cat.name = name;
        System.out.println("Cat init with name " + name);
        return cat;
    }

    public String getName() {
        return name;
    }
}
