package com.pluralsight;

public class NameFormatter {
    private NameFormatter(){
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    private static boolean hasText(String text) {
        if (text == null) {
            return false;
        }
        return !text.trim().isEmpty();
    }
}
