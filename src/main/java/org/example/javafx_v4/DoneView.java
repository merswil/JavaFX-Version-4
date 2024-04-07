package org.example.javafx_v4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
        view.setPadding(new Insets(20));
        Label label = new Label("Summary of choice:\n\n");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 40px;");

        // Read and display information from InputData.txt
        ObservableList<String> dataList = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("InputData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dataList.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading input data from file: " + e.getMessage());
        }

        ListView<String> listView = new ListView<>(dataList);
        listView.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        listView.setPrefHeight(2000); // Set the preferred height of the ListView
        listView.setPrefWidth(800); // Set the preferred width of the ListView
        listView.setPadding(new Insets(10)); // Add padding to the ListView

        view.getChildren().addAll(label, listView);
    }

    public Node getView() {
        return view;
    }
}
