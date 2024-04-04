package org.example.javafx_v4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class DashboardView {
    private VBox view;

    public DashboardView() {
        view = new VBox();
        Label label = new Label("  Welcome to our construction platform!");
        label.setStyle("-fx-text-fill: white; -fx-font-size: 40px;");

        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10); // Horizontal gap between columns
        gridPane.setVgap(10); // Vertical gap between rows

        // Load the images
        Image image1 = new Image(getClass().getResourceAsStream("009.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("007.jpg"));
        Image image3 = new Image(getClass().getResourceAsStream("008.jpg"));
        Image image4 = new Image(getClass().getResourceAsStream("010.jpg"));

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Set dimensions for each ImageView
        imageView1.setFitWidth(782);
        imageView1.setFitHeight(490);
        imageView2.setFitWidth(782);
        imageView2.setFitHeight(490);
        imageView3.setFitWidth(782);
        imageView3.setFitHeight(490);
        imageView4.setFitWidth(782);
        imageView4.setFitHeight(490);

        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        // Add the GridPane and other components to the VBox
        VBox.setMargin(gridPane, new Insets(10)); // Adjust margins as needed
        view.getChildren().addAll(label, gridPane);
    }

    public Node getView() {
        return view;
    }
}