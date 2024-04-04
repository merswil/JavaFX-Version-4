package org.example.javafx_v4;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class DesignView {
    private VBox view;

    public DesignView() {
        view = new VBox();

        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10); // Horizontal gap between columns
        gridPane.setVgap(10); // Vertical gap between rows

        // Load the images
        Image image1 = new Image(getClass().getResourceAsStream("b.jpg"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(388);
        imageView1.setFitHeight(210);

        Image image2 = new Image(getClass().getResourceAsStream("c.jpg"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(388);
        imageView2.setFitHeight(210);

        Image image3 = new Image(getClass().getResourceAsStream("d.jpg"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(388);
        imageView3.setFitHeight(210);

        Image image4 = new Image(getClass().getResourceAsStream("e.jpg"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(388);
        imageView4.setFitHeight(210);

        Image image5 = new Image(getClass().getResourceAsStream("f.jpg"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setFitWidth(388);
        imageView5.setFitHeight(210);


        Image image6 = new Image(getClass().getResourceAsStream("g.jpg"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setFitWidth(388);
        imageView6.setFitHeight(210);


        Image image7 = new Image(getClass().getResourceAsStream("h.jpg"));
        ImageView imageView7 = new ImageView(image7);
        imageView7.setFitWidth(388);
        imageView7.setFitHeight(210);


        Image image8 = new Image(getClass().getResourceAsStream("r.jpg"));
        ImageView imageView8 = new ImageView(image8);
        imageView8.setFitWidth(388);
        imageView8.setFitHeight(210);


        Image image9 = new Image(getClass().getResourceAsStream("j.jpg"));
        ImageView imageView9 = new ImageView(image9);
        imageView9.setFitWidth(388);
        imageView9.setFitHeight(210);


        Image image10 = new Image(getClass().getResourceAsStream("k.jpg"));
        ImageView imageView10 = new ImageView(image10);
        imageView10.setFitWidth(388);
        imageView10.setFitHeight(210);

        Image image11 = new Image(getClass().getResourceAsStream("l.jpg"));
        ImageView imageView11 = new ImageView(image11);
        imageView11.setFitWidth(388);
        imageView11.setFitHeight(210);


        Image image12 = new Image(getClass().getResourceAsStream("m.jpg"));
        ImageView imageView12 = new ImageView(image12);
        imageView12.setFitWidth(388);
        imageView12.setFitHeight(210);


        Image image13 = new Image(getClass().getResourceAsStream("n.jpg"));
        ImageView imageView13 = new ImageView(image13);
        imageView13.setFitWidth(388);
        imageView13.setFitHeight(210);


        Image image14 = new Image(getClass().getResourceAsStream("o.jpg"));
        ImageView imageView14 = new ImageView(image14);
        imageView14.setFitWidth(388);
        imageView14.setFitHeight(210);

        Image image15 = new Image(getClass().getResourceAsStream("p.jpg"));
        ImageView imageView15 = new ImageView(image15);
        imageView15.setFitWidth(388);
        imageView15.setFitHeight(210);

        Image image16 = new Image(getClass().getResourceAsStream("q.jpg"));
        ImageView imageView16 = new ImageView(image16);
        imageView16.setFitWidth(388);
        imageView16.setFitHeight(210);


        Label label1 = new Label(" Pool,three rooms: €7 mill");
        label1.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label2 = new Label("Pool, six rooms: €9 mill");
        label2.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label3 = new Label("Pool, seven rooms: €11 mill");
        label3.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label4 = new Label("Four rooms: €4.5 mill");
        label4.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label5 = new Label("Three rooms: €5 mill");
        label5.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label6 = new Label("Six rooms: €6 mill");
        label6.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label7 = new Label("Four rooms: €7 mill");
        label7.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label8 = new Label("Five rooms: €6.5 mill");
        label8.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label9 = new Label("Five rooms: €4 mill");
        label9.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label10 = new Label("Two rooms: €1.5 mill");
        label10.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label11 = new Label("Four rooms: €6.5 mill");
        label11.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label12 = new Label("Seven rooms: €14 mill");
        label12.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label13 = new Label("Three rooms: €3.5 mill");
        label13.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label14 = new Label("Eight rooms: €8 mill");
        label14.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label15 = new Label("Four rooms: €7 mill");
        label15.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

        Label label16 = new Label("Three rooms: €9.5 mill");
        label16.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");



        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 2, 0);
        gridPane.add(imageView4, 3, 0);

        gridPane.add(label1, 0, 1);
        gridPane.add(label2, 1, 1);
        gridPane.add(label3, 2, 1);
        gridPane.add(label4, 3, 1);

        gridPane.add(imageView5, 0, 2);
        gridPane.add(imageView6, 1, 2);
        gridPane.add(imageView7, 2, 2);
        gridPane.add(imageView8, 3, 2);

        gridPane.add(label5, 0, 3);
        gridPane.add(label6, 1, 3);
        gridPane.add(label7, 2, 3);
        gridPane.add(label8, 3, 3);

        gridPane.add(imageView9, 0, 4);
        gridPane.add(imageView10, 1, 4);
        gridPane.add(imageView11, 2, 4);
        gridPane.add(imageView12, 3, 4);

        gridPane.add(label9, 0, 5);
        gridPane.add(label10, 1, 5);
        gridPane.add(label11, 2, 5);
        gridPane.add(label12, 3, 5);

        gridPane.add(imageView13, 0, 6);
        gridPane.add(imageView14, 1, 6);
        gridPane.add(imageView15, 2, 6);
        gridPane.add(imageView16, 3, 6);

        gridPane.add(label13, 0, 7);
        gridPane.add(label14, 1, 7);
        gridPane.add(label15, 2, 7);
        gridPane.add(label16, 3, 7);

        // Add the GridPane and other components to the VBox
        VBox.setMargin(gridPane, new Insets(10)); // Adjust margins as needed
        view.getChildren().addAll(gridPane);
    }

    public Node getView() {
        return view;
    }
}


