package dev.grafity;

import java.util.ArrayList;

public class School {
    String name;
    ClassRoom roomOne = new ClassRoom();
    ClassRoom roomTwo = new ClassRoom();

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", roomOne=" + roomOne +
                ", roomTwo=" + roomTwo +
                '}';
    }
}
