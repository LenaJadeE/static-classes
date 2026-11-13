package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){
    }

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        String result = lastName + ", ";

        if (hasText(prefix)) {
            result += prefix + " ";
        }

        result += firstName;

        if (hasText(middleName)) {
            result += " " + middleName;
        }

        if (hasText(suffix)) {
            result += ", " + suffix;
        }

        return result;
    }

    private static boolean hasText(String text) {
        if (text == null) {
            return false;
        }
        return !text.trim().isEmpty();
    }
}
