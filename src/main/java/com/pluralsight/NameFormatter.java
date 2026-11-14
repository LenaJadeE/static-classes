package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
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

    public static String format(String fullName) {
        String[] parts = fullName.split(",");
        String namePart = parts[0].trim();

        String suffix = "";
        if (parts.length > 1) {
            suffix = parts[1].trim();
        }

        String[] words = namePart.split(" ");

        String prefix = "";
        int firstIndex = 0;
        if (words[0].endsWith(".")) {
            prefix = words[0];
            firstIndex = 1;
        }

        String firstName = words[firstIndex];
        String lastName = words[words.length - 1];

        StringBuilder middle = new StringBuilder();
        for (int i = firstIndex + 1; i < words.length - 1; i++) {
            middle.append(words[i]);
            middle.append(" ");
        }
        String middleName = middle.toString().trim();

        return format(prefix, firstName, middleName, lastName, suffix);
    }

    private static boolean hasText(String text) {
        if (text == null) {
            return false;
        }
        return !text.trim().isEmpty();
    }
}
