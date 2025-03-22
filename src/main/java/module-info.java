module com.example.rechner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rechner to javafx.fxml;
    exports com.example.rechner;
}