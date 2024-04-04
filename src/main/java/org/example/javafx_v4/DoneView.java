package org.example.javafx_v4;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DoneView {
    private VBox view;

    public DoneView() {
        view = new VBox();
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: #2B4257;");
        Label label = new Label("Summary of choice:\n\n");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 40px;");

        // Read and display information from InputData.txt
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("InputData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Label inputDataContentLabel = new Label(data.toString());
        inputDataContentLabel.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");

        view.getChildren().addAll(label, inputDataContentLabel);

        ScrollPane scrollPane = new ScrollPane(view);
        scrollPane.setPrefHeight(1500);
        scrollPane.setFitToWidth(true); // Adjusts content width to fit ScrollPane
        scrollPane.setFitToHeight(true); // Adjusts content height to fit ScrollPane
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Disable horizontal scrollbar
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS); // Enable vertical scrollbar
        scrollPane.setStyle("-fx-background: transparent;"); // Transparent background to match the scene's background

        // Set the ScrollPane as the final view
        view = new VBox(scrollPane);
    }

    public Node getView() {
        return view;
    }
}
