package com.javarush.test.NewClassLesson;

/**
 * Created by Артем on 24.02.2015.
 */
public class Animal
{
    private String name = "Живность";

    public String getName() {
        return name;
    }
    public void setName(String a) {
        name = a;

    }

    public void checkSound() {
        System.out.println("Животное издает звук");
    }
    Animal() {

    }

}
