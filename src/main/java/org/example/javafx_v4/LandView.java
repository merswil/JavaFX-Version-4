package org.example.javafx_v4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LandView {
    private VBox view;
    private ComboBox<String> locationComboBox; // Declare locationComboBox and dimensionComboBox as class fields
    private ComboBox<String> dimensionComboBox;

    public LandView() {
        view = new VBox();
        view.setAlignment(Pos.CENTER);
        view.setSpacing(20);

        Label titleLabel = new Label("Select Land Details");
        titleLabel.setStyle("-fx-text-fill: white; -fx-font-size: 40px; -fx-font-weight: bold;");

        Label locationLabel = new Label("Land Location:");
        locationLabel.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        ObservableList<String> locations = FXCollections.observableArrayList(
                "Helsinki", "Joensuu", "Kuopio", "Tempere", "Toko", "Vantaa");
        locationComboBox = new ComboBox<>(locations); // Initialize locationComboBox
        locationComboBox.setPromptText("Select Land Location");

        Label dimensionLabel = new Label("Land Dimension:");
        dimensionLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> dimensions = FXCollections.observableArrayList(
                "20*20 = 400m2", "30*20 = 600m2", "25*25 = 625m2", "30*35 = 1050m2", "40*40 = 1600m2");
        dimensionComboBox = new ComboBox<>(dimensions); // Initialize dimensionComboBox
        dimensionComboBox.setPromptText("Select Land Dimension");

        Label landtypeLabel = new Label("Land type:");
        landtypeLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        ObservableList<String> landtype = FXCollections.observableArrayList(
                "Government Land", "Native Land");
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
                dimensionComboBox, landtypeLabel, landtypeComboBox, label, ok);
    }

    public Node getView() {
        return view;
    }

    public String getSelectedDimension() {
        return dimensionComboBox.getValue(); // Return the selected dimension from dimensionComboBox
    }

    public String getSelectedLocation() {
        return locationComboBox.getValue(); // Return the selected location from locationComboBox
    }

    public int getLandCostPerUnitSquare() {
        int landCostPerUnitSquare = 0;
        String selectedLocation = getSelectedLocation();

        // Assign land cost based on the selected location
        switch (selectedLocation) {
            case "Helsinki":
                landCostPerUnitSquare = 50;
                break;
            case "Joensuu":
                landCostPerUnitSquare = 20;
                break;
            case "Kuopio":
                landCostPerUnitSquare = 25;
                break;
            case "Tempere":
                landCostPerUnitSquare = 30;
                break;
            case "Toko":
                landCostPerUnitSquare = 35;
                break;
            case "Vantaa":
                landCostPerUnitSquare = 45;
                break;
        }
        return landCostPerUnitSquare;
    }


    public int getSelectedDimention() {
        int landDimention = 0;
        String selectedDimention = getSelectedDimension();

        switch (selectedDimention) {
            case "20*20 = 400m2":
                landDimention = 400;
                break;
            case "30*20 = 600m2":
                landDimention = 600;
                break;
            case "25*25 = 625m2":
                landDimention = 625;
                break;
            case "30*35 = 1050m2":
                landDimention = 1050;
                break;
            case "40*40 = 1600m2":
                landDimention = 1600;
                break;
        }
        return landDimention;
    }


    public int TotalLandCost(){
        return  getLandCostPerUnitSquare() * getSelectedDimention();
    }
}
