package org.example.javafx_v4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CustomerInfoView {
    private VBox view;

    public CustomerInfoView() {
        view = new VBox();
        view.setAlignment(Pos.CENTER); // Center VBox contents

        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER); // Center GridPane contents
        gridPane.setHgap(20); // Horizontal gap between columns
        gridPane.setVgap(20); // Vertical gap between rows
        gridPane.setPadding(new Insets(20)); // Add padding to the GridPane

        // Customer Name TextField
        TextField nameTextField = new TextField();
        nameTextField.setPromptText("Enter Name");

        // Customer Email TextField
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Email");

        // Customer Number TextField
        TextField numberTextField = new TextField();
        numberTextField.setPromptText("Enter Number");

        Label label = new Label("Please fill in Your information!");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 40px;");

        Label label2 = new Label("Name:");
        label2.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label3 = new Label("Email:");
        label3.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label4 = new Label("Phone Number:");
        label4.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");


        Label label5 = new Label("Do you want to buy a house?");
        label5.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Button yes = new Button("YES");
        Button no = new Button("NO");

        yes.setOnAction(e -> {
            // Handle OK button click
            // Save customer information
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String number = numberTextField.getText();
            InputData.appendCustomerData(name, email, number);
            // For demonstration, just navigating to the next view
            VBoxLeft.root.setCenter(new DesignView().getView());
        });

        no.setOnAction(e -> {
            // Handle OK button click
            // Save customer information
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String number = numberTextField.getText();
            InputData.appendCustomerData(name, email, number);
            // For demonstration, just navigating to the next view
            VBoxLeft.root.setCenter(new LandView().getView());
        });

        // Add components to the GridPane
        gridPane.add(label, 0, 0, 2, 1); // Span label across two columns

        gridPane.add(label2, 0, 1);
        gridPane.add(nameTextField, 1, 1, 2, 1); // Span nameTextField across two columns

        gridPane.add(label3, 0, 2);
        gridPane.add(emailTextField, 1, 2, 2, 1); // Span emailTextField across two columns

        gridPane.add(label4, 0, 3);
        gridPane.add(numberTextField, 1, 3, 2, 1); // Span numberTextField across two columns

        gridPane.add(label5,0,6);

        gridPane.add(yes, 0,7); // Span done button across two columns
        gridPane.add(no,1,7);

        view.getChildren().add(gridPane);
    }

    public Node getView() {
        return view;
    }
}
