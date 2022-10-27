module com.example.uslu_sayi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uslu_sayi to javafx.fxml;
    exports com.example.uslu_sayi;
}