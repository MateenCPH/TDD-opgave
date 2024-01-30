package org.example;

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
}
