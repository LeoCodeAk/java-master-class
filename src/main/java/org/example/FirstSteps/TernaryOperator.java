package org.example.FirstSteps;

public class TernaryOperator {
    public static void main(String[] args) {
        // operand1 ? operand2 : operand 3
        //checks if operand 1 is true if it is, it will return operand2 (WHICH IS TRUE) and if it not it will return operand 3 (WHICH MEANS FALSE)
        //Is a shortut to assign one or two values to a variable.. is a SHORTCUT for if- else statement

        int ageOfClient = 17;
        String ageOfConsent = ageOfClient >= 18 ? "You are of age of consent" : "Not age of consent";
        System.out.println(ageOfConsent);
    }
}
