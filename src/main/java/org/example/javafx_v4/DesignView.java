package org.example.javafx_v4;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class DesignView {
    private VBox view;

    public DesignView() {
        view = new VBox();

        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(20); // Horizontal gap between columns
        gridPane.setVgap(20); // Vertical gap between rows

        // Load the images
        Image image1 = new Image(getClass().getResourceAsStream("b.jpg"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(510);
        imageView1.setFitHeight(280);
        DropShadow dropShadow1 = new DropShadow();
        dropShadow1.setRadius(50.0);
        dropShadow1.setColor(Color.BLACK);
        imageView1.setEffect(dropShadow1);
        imageView1.setOnMouseClicked(createImageClickHandler("Purchase price for Pool, three rooms: €7 millions"));



        Image image2 = new Image(getClass().getResourceAsStream("c.jpg"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(510);
        imageView2.setFitHeight(280);
        DropShadow dropShadow2 = new DropShadow();
        dropShadow2.setRadius(50.0);
        dropShadow2.setColor(Color.BLACK);
        imageView2.setEffect(dropShadow2);
        imageView2.setOnMouseClicked(createImageClickHandler("Purchase price for Pool, six rooms: €9 millions"));



        Image image3 = new Image(getClass().getResourceAsStream("d.jpg"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(510);
        imageView3.setFitHeight(280);
        DropShadow dropShadow3 = new DropShadow();
        dropShadow3.setRadius(50.0);
        dropShadow3.setColor(Color.BLACK);
        imageView3.setEffect(dropShadow3);
        imageView3.setOnMouseClicked(createImageClickHandler("Purchase price for Pool, seven rooms: €11 millions"));



        Image image5 = new Image(getClass().getResourceAsStream("f.jpg"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitWidth(510);
        imageView5.setFitHeight(280);
        DropShadow dropShadow5 = new DropShadow();
        dropShadow5.setRadius(50.0);
        dropShadow5.setColor(Color.BLACK);
        imageView5.setEffect(dropShadow5);
        imageView5.setOnMouseClicked(createImageClickHandler("Purchase price for Three rooms: €5 millions"));



        Image image6 = new Image(getClass().getResourceAsStream("g.jpg"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setFitWidth(510);
        imageView6.setFitHeight(280);
        DropShadow dropShadow6 = new DropShadow();
        dropShadow6.setRadius(50.0);
        dropShadow6.setColor(Color.BLACK);
        imageView6.setEffect(dropShadow6);
        imageView6.setOnMouseClicked(createImageClickHandler("Purchase price for Six rooms: €6 millions"));




        Image image7 = new Image(getClass().getResourceAsStream("h.jpg"));
        ImageView imageView7 = new ImageView(image7);
        imageView7.setFitWidth(510);
        imageView7.setFitHeight(280);
        DropShadow dropShadow7 = new DropShadow();
        dropShadow7.setRadius(50.0);
        dropShadow7.setColor(Color.BLACK);
        imageView7.setEffect(dropShadow7);
        imageView7.setOnMouseClicked(createImageClickHandler("Purchase price for Four rooms: €7 millions"));




        Image image9 = new Image(getClass().getResourceAsStream("j.jpg"));
        ImageView imageView9 = new ImageView(image9);
        imageView9.setFitWidth(510);
        imageView9.setFitHeight(280);
        DropShadow dropShadow9 = new DropShadow();
        dropShadow9.setRadius(50.0);
        dropShadow9.setColor(Color.BLACK);
        imageView9.setEffect(dropShadow9);
        imageView9.setOnMouseClicked(createImageClickHandler("Purchase price for Five rooms: €4 millions"));




        Image image10 = new Image(getClass().getResourceAsStream("k.jpg"));
        ImageView imageView10 = new ImageView(image10);
        imageView10.setFitWidth(510);
        imageView10.setFitHeight(280);
        DropShadow dropShadow10 = new DropShadow();
        dropShadow10.setRadius(50.0);
        dropShadow10.setColor(Color.BLACK);
        imageView10.setEffect(dropShadow10);
        imageView10.setOnMouseClicked(createImageClickHandler("Purchase price for Two rooms: €1.5 millions"));




        Image image11 = new Image(getClass().getResourceAsStream("l.jpg"));
        ImageView imageView11 = new ImageView(image11);
        imageView11.setFitWidth(510);
        imageView11.setFitHeight(280);
        DropShadow dropShadow11 = new DropShadow();
        dropShadow11.setRadius(50.0);
        dropShadow11.setColor(Color.BLACK);
        imageView11.setEffect(dropShadow11);
        imageView11.setOnMouseClicked(createImageClickHandler("Purchase price for Four rooms: €6.5 millions"));





        Label label1 = new Label("Pool,three rooms: €7 mill");
        label1.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label2 = new Label("Pool, six rooms: €9 mill");
        label2.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label3 = new Label("Pool, seven rooms: €11 mill");
        label3.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label5 = new Label("Three rooms: €5 mill");
        label5.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label6 = new Label("Six rooms: €6 mill");
        label6.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label7 = new Label("Four rooms: €7 mill");
        label7.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label9 = new Label("Five rooms: €4 mill");
        label9.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label10 = new Label("Two rooms: €1.5 mill");
        label10.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label11 = new Label("Four rooms: €6.5 mill");
        label11.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");


        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 2, 0);

        gridPane.add(label1, 0, 1);
        gridPane.add(label2, 1, 1);
        gridPane.add(label3, 2, 1);

        gridPane.add(imageView5, 0, 2);
        gridPane.add(imageView6, 1, 2);
        gridPane.add(imageView7, 2, 2);

        gridPane.add(label5, 0, 3);
        gridPane.add(label6, 1, 3);
        gridPane.add(label7, 2, 3);

        gridPane.add(imageView9, 0, 4);
        gridPane.add(imageView10, 1, 4);
        gridPane.add(imageView11, 2, 4);


        gridPane.add(label9, 0, 5);
        gridPane.add(label10, 1, 5);
        gridPane.add(label11, 2, 5);


        // Add the GridPane and other components to the VBox
        VBox.setMargin(gridPane, new Insets(10)); // Adjust margins as needed
        view.getChildren().addAll(gridPane);
    }

    public Node getView() {
        return view;
    }


    private EventHandler<MouseEvent> createImageClickHandler(String feedbackMessage) {
        return event -> {
            // Append feedback message to the input.txt file
            InputData.appendFeedback(feedbackMessage );
            // Load the FeedbackView
            VBoxLeft.root.setCenter(new FeedbackView().getView());
        };
    }
}




