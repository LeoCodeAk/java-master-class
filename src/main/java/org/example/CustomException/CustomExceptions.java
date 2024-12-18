package org.example.CustomException;

public class CustomExceptions {
    public static void main(String[] args) throws AgeLessThanZeroException {
        /*
        *  */

        validAge(-3);
    }

    private static void validAge(int age) throws AgeLessThanZeroException {
        if(age < 0) {
            throw new AgeLessThanZeroException("Message, something went worng" ,new IllegalArgumentException());
        }
    }
}
