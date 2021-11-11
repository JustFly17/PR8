package ru.mirea.gibo01.pr8.zadanie1;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Вискас");
        Pet pet1 = new Pet(23,"Барсик");
        Pet pet2 = new Pet();
        System.out.println(pet.getType());
        System.out.println(pet1.getType());
        System.out.println(pet2.getName());

        Cat cat1 = new Cat(12,"Борис");
        System.out.println(cat1.getType() + " "+ cat1.getName() + " " + cat1.meow());

        Dog dog = new Dog(5,"Шарик");
        System.out.println(dog.getType() + " it's name is " + dog.getName() + "\nHi, "+dog.getName()+" Say something: " + dog.bark());
    }


}
