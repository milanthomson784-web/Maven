package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private String studentName;
    private String studentId;
    private List<String> subjects = new ArrayList<>();
    private int totalCredits = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App system = new App();

        System.out.print("Enter Student Name: ");
        system.studentName = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        system.studentId = scanner.nextLine();

        System.out.print("How many subjects to add? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter Subject Name: ");
            String sub = scanner.nextLine();
            System.out.print("Enter Credit Value: ");
            int credit = scanner.nextInt();
            scanner.nextLine();
            
            system.addSubject(sub, credit);
        }

        system.displayDetails();
    }

    public void addSubject(String subject, int credit) {
        subjects.add(subject);
        totalCredits += credit;
    }

    public boolean isEligible() {
        return totalCredits >= 15;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void displayDetails() {
        System.out.println("\n--- Registration Summary ---");
        System.out.println("Student: " + studentName + " (ID: " + studentId + ")");
        System.out.println("Subjects: " + String.join(", ", subjects));
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Status: " + (isEligible() ? "ELIGIBLE" : "NOT ELIGIBLE"));
    }
}
