package org.example.Inheritance;

public class NoMultiInheritance {
    public static void main(String[] args) {
        /*What is Inheritance? Inheritance is OOP is when one class inherits class or methods from another class.
        * For example there is an Animal class with attributes age, name and a makeNoise() method
        *There might be a cat class that will inherit Animal class. Animal is the parent(Super) class and Cat is the subclass.
        * Cat class will get the fields and methods from the parent class. M
        * */


        Cat myCat = new Cat();
        myCat.makeNoise();
        myCat.setName("Kramer");

        /*What is Multiple Inheritance? One class has more then one parent class which Java does not allow.
        But why?? "Diamond Problem" The class that inherits two class will not be able to decide which method to use..
        Keep the language simple if they allowed Multiple Inheritance.. developers would come up with problems..

        *  */

        Cog myCog = new Cog();
        myCog.fetch();

    }
}
