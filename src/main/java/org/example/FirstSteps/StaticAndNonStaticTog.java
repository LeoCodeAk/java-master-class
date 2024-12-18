package org.example.FirstSteps;

public class StaticAndNonStaticTog {

    /*
    * Static: Remember that the object is shared. such as one whiteboard being shared by all students
    * Non-Static: Each object has their own individual property or behavior. Each student has their own notebook.
    *
    * If it's tied to the class, make it static. Ex: Constants, Total bank balance in a banking system.
    * If its tied ot an object, make it non-static.
    * */
    static int staticVariable = 10; //Static Variable
    int nonStaticVariable = 20; // Non-Static variable

    static void StaticMethod() {
        System.out.println("Static method: StaticVariable = " + staticVariable);

        //Non-static variable cannot be accessed directly
        //System.out.println(nonStaticVariable); //ERROR
    }

    void nonStaticMethod() {
        System.out.println("Non-Static method: StaticVariable = " + staticVariable);
        System.out.println("Non-Static Method: NonStaticVariable = " + nonStaticVariable);
    }

    public static void main(String[] args) {
        //Call static method
        StaticAndNonStaticTog.StaticMethod();
        StaticAndNonStaticTog nonStaticObj = new StaticAndNonStaticTog();
        nonStaticObj.nonStaticMethod();
    }
}
