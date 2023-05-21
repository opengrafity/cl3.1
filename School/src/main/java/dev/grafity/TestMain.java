package dev.grafity;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestMain {
    public static void main(String[] args) {
        String country = "Bharath";
        String name = country+" is my mother land";
        name = ClassRoom.titleCase(name);
        System.out.println(name);
        name = "I love "+country;
        name = ClassRoom.titleCase(name);
        System.out.println(name);
    }
}
