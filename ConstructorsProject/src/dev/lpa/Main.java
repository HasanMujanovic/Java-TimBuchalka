package dev.lpa;

import external.Child;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Jane Doe","01/01/1950",4);
        Child child = new Child();

        System.out.println(parent);
        System.out.println(child);

        Person joe = new Person("Joe", "01-01-1995");
        System.out.println(joe);

        Person joeCopy = new Person(joe);
        System.out.println(joeCopy);

        Generation g = Generation.BABY_BOOMER;
    }
}
