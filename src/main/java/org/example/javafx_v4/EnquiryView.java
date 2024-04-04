package org.example.javafx_v4;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class EnquiryView {
    private VBox view;

    public EnquiryView() {
        view = new VBox();
        view.setStyle("-fx-padding: 20px;"); // Add padding to create margin around the VBox




        Text text1 = new Text("                                   " +
                "                ABOUT CONCOEST");
        text1.setStyle("-fx-fill: black; -fx-font-size: 40px;");




        // Text for label2
        Text text2 = new Text("\n\n\n" +

                "  CONCOEST is one of the leading construction companies in the Nordic countries. We manage complex and demanding construction\n" +
                "  processes and, through construction, we have a positive impact on our customers and society. In Finland, we are involved in\n" +
                "  property development and construction projects as well as the production of aggregates. CONCOEST is one of the largest construction\n" +
                "  companies in Finland. Our core business is construction and property development.\n\n\n\n");
        text2.setStyle("-fx-fill: black; -fx-font-size: 25px;");





        // Text for label3
        Text text3 = new Text(
                "  CONCOEST is one of Finland's largest construction and property development companies. In 2022, CONCOEST turnover in Finland\n" +
                        "   was approximately 500 million euros, and we  Development Oy, and NCC Industry Oy are subsidiaries of NCC AB. employed around\n" +
                        "   1,100 people. The Finnish companies NCC Suomi Oy, CONCOEST Property We have a long tradition in residential construction as well\n" +
                        "   as in the development and construction of commercial properties. We are a significant builder of schools in Finland. Our mark\n" +
                        "   position is strong in renovation construction, especially in the renovation of prestigious properties in the Helsinki metropolitan\n" +
                        "   area. Our operations are focused on Finland's growth centers.\n" +
                        "\n\n\n\n" +




                        "  Our expertise lies in managing complex construction processes from concept to implementation and beyond. We emphasize partnership\n " +
                        "  and collaboration with our customers and other stakeholders to ensure that all parties can contribute to the project's success we\n" +
                        "  work diligently to reduce both our and our customers' environmental impact and to make our operations and offerings more sustainable\n" +
                        "  and responsible. We actively promote occupational safety, develop construction digitalization, and focus on the sustainability of \n" +
                        "  our procurement." +
                        "\n\n\n\n\n" + "\n\n\n\n\n"
        );
        text3.setStyle("-fx-fill: black; -fx-font-size: 25px;");

        view.getChildren().addAll(text1,text2, text3);

        // Create a ScrollPane and set the VBox as its content
        ScrollPane scrollPane = new ScrollPane(view);
        scrollPane.setPrefHeight(1500);
        scrollPane.setFitToWidth(true); // Adjusts content width to fit ScrollPane
        scrollPane.setFitToHeight(true); // Adjusts content height to fit ScrollPane
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Disable horizontal scrollbar
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS); // Enable vertical scrollbar
        scrollPane.setStyle("-fx-background: transparent;"); // Transparent background to match the scene's background

        // Set the ScrollPane as the final view
        view = new VBox(scrollPane);
    }

    public Node getView() {
        return view;
    }
}
