package Passwordgenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Password Generator ===");

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include Uppercase? (true/false): ");
        boolean upper = sc.nextBoolean();

        System.out.print("Include Lowercase? (true/false): ");
        boolean lower = sc.nextBoolean();

        System.out.print("Include Numbers? (true/false): ");
        boolean numbers = sc.nextBoolean();

        System.out.print("Include Symbols? (true/false): ");
        boolean symbols = sc.nextBoolean();

        String password = PasswordGenerator.generatePassword(
                length, upper, lower, numbers, symbols);

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
