package org.example.javafx_v4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ConstructionView {
    private VBox view;

    public ConstructionView() {
        view = new VBox();
        view.setAlignment(Pos.CENTER);
        view.setSpacing(20);
        view.setPadding(new Insets(20));

        Label titleLabel = new Label("Select Construction Details");
        titleLabel.setStyle("-fx-text-fill: white; -fx-font-size: 24px; -fx-font-weight: bold;");

        Label stepsLabel = new Label("Construction steps:");
        stepsLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> steps = FXCollections.observableArrayList(
                "One Step", "Two steps", "Three steps", "Four steps");
        ComboBox<String> stepsComboBox = new ComboBox<>(steps);
        stepsComboBox.setPromptText("Select Construction Steps");

        Label roomsLabel = new Label("Number of Rooms:");
        roomsLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> rooms = FXCollections.observableArrayList(
                "One Room", "Two Rooms", "Three Rooms", "Four Rooms", "Five Rooms");
        ComboBox<String> roomsComboBox = new ComboBox<>(rooms);
        roomsComboBox.setPromptText("Select Number of Rooms");

        Label materialLabel = new Label("Material:");
        materialLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> materials = FXCollections.observableArrayList(
                "Wood", "Metal", "Concrete", "Glass", "Bricks");
        ComboBox<String> materialComboBox = new ComboBox<>(materials);
        materialComboBox.setPromptText("Select Construction Material");

        Label typeLabel = new Label("House Type:");
        typeLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> types = FXCollections.observableArrayList(
                "Barn", "Bungalow", "Cabin", "Castle", "Container House", "Cottage", "Farm House", "Hut");
        ComboBox<String> typeComboBox = new ComboBox<>(types);
        typeComboBox.setPromptText("Select Construction Type");

        Label statusLabel = new Label("No of Floor(s):");
        statusLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> statuses = FXCollections.observableArrayList(
                "One", "Two", "Three", "Four", "Five");
        ComboBox<String> statusComboBox = new ComboBox<>(statuses);
        statusComboBox.setPromptText("Select Number of floor(s)");

        Label label = new Label("\n\n\n\n");

        Button ok = new Button("OK");
        ok.setOnAction(e -> {
            // Construct data string
            StringBuilder data = new StringBuilder();
            data.append("Construction steps: ").append(stepsComboBox.getValue()).append("\n");
            data.append("Number of Rooms: ").append(roomsComboBox.getValue()).append("\n");
            data.append("Material: ").append(materialComboBox.getValue()).append("\n");
            data.append("House Type: ").append(typeComboBox.getValue()).append("\n");
            data.append("Number of Floors: ").append(statusComboBox.getValue());

            // Save data to file
            InputData.appendConstructionData(data.toString());

            // Handle OK button click
            VBoxLeft.root.setCenter(new FeedbackView().getView());
        });


        view.getChildren().addAll(titleLabel, stepsLabel, stepsComboBox, roomsLabel, roomsComboBox,
                materialLabel, materialComboBox, typeLabel, typeComboBox, statusLabel, statusComboBox,
                label,ok);
    }

    public Node getView() {
        return view;
    }


}
