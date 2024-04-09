package org.example.javafx_v4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class FeedbackView extends LandView{
    private VBox view;

    public FeedbackView() {
        view = new VBox();
        Label label = new Label("We would love to receive Feedback from you!");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 40px;");

        // Create a GridPane for layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(20);

        // TextArea for input
        TextArea inputTextArea = new TextArea();
        inputTextArea.setPromptText("Enter your feedback");
        inputTextArea.setWrapText(true); // Enable text wrapping
        inputTextArea.setPrefRowCount(5); // Set preferred row count

        Button ok = new Button("OK");

        // Add components to the GridPane
        gridPane.add(inputTextArea, 0, 0);
        gridPane.add(ok, 0, 1);

        ok.setOnAction(e -> {
            // Handle OK button click
            // Save feedback
            InputData.appendFeedback("Feedback: " + inputTextArea.getText() + "\n\n\n");
            // Handle Land button click
            VBoxLeft.root.setCenter(new DoneView().getView());
        });


        // Add the label, GridPane, and OK button to the VBox
        view.getChildren().addAll(label, gridPane);

        // Set VBox properties
        view.setAlignment(Pos.CENTER);
        view.setPadding(new Insets(20));
    }

    public Node getView() {
        return view;
    }
}
