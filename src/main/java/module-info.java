module org.example.javafx_v4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafx_v4 to javafx.fxml;
    exports org.example.javafx_v4;
}