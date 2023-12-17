package iegcode.java.application;

import iegcode.java.data.Animal;
import iegcode.java.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
