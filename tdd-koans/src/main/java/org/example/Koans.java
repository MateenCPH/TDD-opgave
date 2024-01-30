package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Koans {
    public static String greet(String inputName) {
        if (inputName.isEmpty()) {
            return "Hello, my friend";
        } else if (inputName.equals(inputName.toUpperCase())) {
            return "HELLO " + inputName + "!";
        } else {
            return "Hello, " + inputName;
        }
    }

    public static String greet(String[] inputNames) {
        if (inputNames == null || inputNames.length == 0) {
            return "Hello";
        }

        StringBuilder greeting = new StringBuilder("Hello, ");

        for (int i = 0; i < inputNames.length; i++) {
            greeting.append(inputNames[i]);

            if (i < inputNames.length - 2) {
                greeting.append(", ");
            } else if (i == inputNames.length - 2) {
                greeting.append(" and ");
            }
        }

        return greeting.toString();
    }

}
