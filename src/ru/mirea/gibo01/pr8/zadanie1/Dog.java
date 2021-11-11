package ru.mirea.gibo01.pr8.zadanie1;

import java.util.Date;

public class Dog extends Pet {
    private Date lastMeowDate;

    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastBarkDate=" + lastMeowDate +
                '}';
    }

    @Override
    public String getType() {
        return "This is Dog";
    }
    public String bark() {
        lastMeowDate = new Date();
        return "Gav";
    }
}