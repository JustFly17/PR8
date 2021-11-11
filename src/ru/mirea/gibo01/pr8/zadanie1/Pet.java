package ru.mirea.gibo01.pr8.zadanie1;
import java.lang.*;

public class Pet {

    private int age;
    private String name;

    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this.name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return "Unknown";
    }
}
