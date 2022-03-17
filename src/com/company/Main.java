package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekdays = scanner.nextLine();
        try {
            System.out.println(Weekdays.valueOf(weekdays.toUpperCase(Locale.ROOT)));
        } catch (IllegalArgumentException a) {
            System.out.println("Tuura emes jazdynyz: " + weekdays);
        }
    }
}