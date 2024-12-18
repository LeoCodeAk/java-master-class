package org.example.Optionals;


import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        /*
        * What is an optionals? Is a container that either has something in it or does not
        * Main purpose: Tell user of a method that the value they are looking for does not exist.
        *  */

        Optional<Cat> optionalCat = findCatByName("Fred");

        Cat myCat = optionalCat.orElseThrow();



    }
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(null);
    }
}
