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

public class LandView {
    private VBox view;

    public LandView() {
        view = new VBox();
        view.setAlignment(Pos.CENTER);
        view.setSpacing(20);
//        view.setPadding(new Insets(20));

        Label titleLabel = new Label("Select Land Details");
        titleLabel.setStyle("-fx-text-fill: white; -fx-font-size: 40px; -fx-font-weight: bold;");



        Label locationLabel = new Label("Land Location:");
        locationLabel.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        ObservableList<String> locations = FXCollections.observableArrayList(
                "Helsinki", "Joensuu", "Kuopio", "Tempere", "Toko", "Vantaa");
        ComboBox<String> locationComboBox = new ComboBox<>(locations);
        locationComboBox.setPromptText("Select Land Location");



        Label dimensionLabel = new Label("Land Dimension:");
        dimensionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> dimensions = FXCollections.observableArrayList(
                "20*20 = 400m2", "30*20 = 600m2", "25*25 = 625m2","30*35 = 1050m2","40*40 = 1600m2");
        ComboBox<String> dimensionComboBox = new ComboBox<>(dimensions);
        dimensionComboBox.setPromptText("Select Land Dimension");



        Label landtypeLabel = new Label("Land type:");
        landtypeLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> landtype = FXCollections.observableArrayList(
                "Government Land","Native Land");
        ComboBox<String> landtypeComboBox = new ComboBox<>(landtype);
        landtypeComboBox.setPromptText("Select Land type");



        Label label = new Label("\n\n\n\n");

        Button ok = new Button("OK");

        ok.setOnAction(e -> {
            // Save land data
            String data = "Location: " + locationComboBox.getValue() +
                    "\nDimension: " + dimensionComboBox.getValue() +
                    "\nLand Type: " + landtypeComboBox.getValue();
            InputData.appendLandData(data);

            // Proceed to the next view
            VBoxLeft.root.setCenter(new ConstructionView().getView());
        });


        view.getChildren().addAll(titleLabel, locationLabel, locationComboBox, dimensionLabel,
                dimensionComboBox,landtypeLabel,landtypeComboBox, label,ok);
    }

    public Node getView() {
        return view;
    }
}

