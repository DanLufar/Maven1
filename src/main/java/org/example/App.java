package org.example;

public class App {
    public static void main(String[] args) {
        int passwordLength = 12;
        String generatedPassword = PasswordGenerator.generatePassword(passwordLength);
        System.out.println("New password: " + generatedPassword);
    }
}
