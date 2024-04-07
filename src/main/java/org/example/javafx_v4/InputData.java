package org.example.javafx_v4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputData {
    private static final String FILE_PATH = "InputData.txt";

    public static void appendCustomerData(String name, String email, String number) {
        appendData("Customer data saved to file successfully!",
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Phone Number: " + number );
    }

    public static void appendConstructionData(String data) {
        appendData("Construction data saved to file successfully!", data);
    }

    public static void appendLandData(String data) {
        appendData("Land data appended to file successfully!", data);
    }

    public static void appendFeedback(String feedback) {
        appendData("Feedback data saved to file successfully!",  feedback );
    }

    public static String appendCalculationData(String data) {
        appendData("Calculation data saved to file successfully!", data);
        return data;
    }

    private static void appendData(String successMessage, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.append(data);
            writer.newLine(); // Add a newline after each entry
            if (successMessage != null) {
                System.out.println(successMessage);
            }
        } catch (IOException e) {
            System.err.println("Error appending data: " + e.getMessage());
        }
    }
}
