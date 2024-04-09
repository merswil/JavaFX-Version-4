package org.example.javafx_v4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #2B4257;");

        primaryStage.setScene(new Scene(root, 1000, 800));

        VBoxLeft leftBox = new VBoxLeft(root);
        root.setLeft(leftBox);

        // Set DashboardView as the default view
        root.setCenter(new DashboardView().getView());

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
