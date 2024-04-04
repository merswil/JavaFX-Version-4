package org.example.javafx_v4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputData {
    private static final String FILE_PATH = "InputData.txt";

    public static void appendCustomerData(String name, String email, String number) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.append("Name: " + name + "\n");
            writer.append("Email: " + email + "\n");
            writer.append("Phone Number: " + number + "\n");
            System.out.println("Input data saved to file successfully!");
        } catch (IOException e) {
            System.err.println("Error saving input data to file: " + e.getMessage());
        }
    }

    public static void appendConstructionData(String data) {
        appendData("Construction data saved to file successfully!", data);
    }

    public static void appendLandData(String data) {
        appendData("Land data appended to file successfully!", data);
    }

    public static void appendFeedback(String feedback) {
        appendData(null, "Feedback: " + feedback + "\n\n\n\n");
    }

    private static void appendData(String successMessage, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            if (data != null) {
                writer.append(data);
                writer.newLine(); // Add a newline after each entry
            }
            if (successMessage != null) {
                System.out.println(successMessage);
            }
        } catch (IOException e) {
            System.err.println("Error appending data: " + e.getMessage());
        }
    }

}
