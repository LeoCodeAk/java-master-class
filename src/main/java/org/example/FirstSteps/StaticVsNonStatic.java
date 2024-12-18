package org.example.FirstSteps;

public class StaticVsNonStatic {
    public static void main(String[] args) {
        /*
        * Static Variables: Shared across all objects of the class. useful for constants or shared properties.
        * Non-Static Variables: Each object gets it own copy. Useful for properties specific to each object.
        *
        *Static Methods: Can be called without creating an object. Used for utility functions or shared behavior.
            *  Cannot access non-static variables directly.
            * Cannot call non-static methods directly
            * Can only use static variables and methods.
        *Non-Static Methods: Requires an object to call it. Used for behavior tied to a specific object.
        * Can call both static and non-static methods.
        * */

        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();

        obj1.incrementCounter(); //sharedCounter = 1
        obj2.incrementCounter(); //SharedCounter = 2 (Shared across all objects)

        System.out.println("Shared Counter: " + StaticVariableExample.sharedCounter);

        NonStaticVariableExample obj3 = new NonStaticVariableExample();
        NonStaticVariableExample obj4 = new NonStaticVariableExample();

        obj3.incrementCounter();
        obj4.incrementCounter();
        System.out.println("Obj3 Counter: " + obj3.individualCounter);
        System.out.println("Obj4 Counter: " + obj4.individualCounter);

        // Static Methods can be called directly using class name
        StaticMethodExample.printMessage();
        //Non-Static method needs to create an object first before calling
        NonStaticMethodExample nonObj = new NonStaticMethodExample();
        nonObj.printMessage();
    }
}

class StaticVariableExample {
    static int sharedCounter = 0; //Static variable

    void incrementCounter() {
        sharedCounter++;
    }
}

class NonStaticVariableExample {
    int individualCounter = 0; // Non-Static variable

    void incrementCounter() {
        individualCounter++;
    }
}

class StaticMethodExample {
    static void printMessage() {
        System.out.println("This is a static method!");
    }
}

class NonStaticMethodExample {
    void printMessage() {
        System.out.println("This is a non-static method!");
    }
}


