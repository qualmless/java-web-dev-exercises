package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapIDRoster {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and IDs
        do {

            System.out.println("ID Number: ");
            newID = input.nextInt();
//            System.out.print("Student: ");
//            newStudent = input.nextLine();

            if (!newID.equals(null)) {
                System.out.print("Student Name: ");
                newStudent = input.nextLine();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newID.equals(null));

        // Print class roster
        System.out.println("\nClass roster:");
//        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " . " + student.getValue());
//            sum += student.getValue();
        }
    }
}
