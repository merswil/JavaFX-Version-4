package org.example.javafx_v4;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class VBoxLeft extends VBox {
    public static BorderPane root;

    public VBoxLeft(BorderPane root) {
        this.root = root;

        setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));

        Button dashboardBtn = new Button("Dashboard");
        dashboardBtn.setPrefSize(300,120);
        VBox.setMargin(dashboardBtn, new Insets(10));

        Button customerInfoBtn = new Button("Customer Info");
        customerInfoBtn.setPrefSize(300,120);
        VBox.setMargin(customerInfoBtn, new Insets(10));

        Button landBtn = new Button("Land");
        landBtn.setPrefSize(300,120);
        VBox.setMargin(landBtn, new Insets(10));

        Button constructionBtn = new Button("Construction");
        constructionBtn.setPrefSize(300,120);
        VBox.setMargin(constructionBtn, new Insets(10));

        Button designBtn = new Button("Design");
        designBtn.setPrefSize(300,120);
        VBox.setMargin(designBtn, new Insets(10));

        Button doneBtn = new Button("Done");
        doneBtn.setPrefSize(300,120);
        VBox.setMargin(doneBtn, new Insets(10));

        Button enquiryBtn = new Button("Enquiry");
        enquiryBtn.setPrefSize(300,120);
        VBox.setMargin(enquiryBtn, new Insets(10));

        Button feedbackBtn = new Button("Feedback");
        feedbackBtn.setPrefSize(300,120);
        VBox.setMargin(feedbackBtn, new Insets(10));

        getChildren().addAll(dashboardBtn,
                customerInfoBtn,
                landBtn, constructionBtn,
                designBtn,feedbackBtn ,
                enquiryBtn, doneBtn);

        dashboardBtn.setOnAction(e -> {
            // Handle Dashboard button click
            root.setCenter(new DashboardView().getView());
        });
        // Set event handlers for other buttons

        customerInfoBtn.setOnAction(e -> {
            // Handle Customer Info button click
            root.setCenter(new CustomerInfoView().getView());
        });

        landBtn.setOnAction(e -> {
            // Handle Land button click
            root.setCenter(new LandView().getView());
        });


        constructionBtn.setOnAction(e -> {
            root.setCenter(new ConstructionView().getView());
        });

        designBtn.setOnAction(e -> {
            // Handle Design button click
            root.setCenter(new DesignView().getView());
        });

        doneBtn.setOnAction(e -> {
            // Handle Done button click
            root.setCenter(new DoneView().getView());
        });

        enquiryBtn.setOnAction(e -> {
            // Handle Enquiry button click
            root.setCenter(new EnquiryView().getView());
        });


        feedbackBtn.setOnAction(e -> {
            root.setCenter(new FeedbackView().getView());
        });


    }


}
