module com.malicia.mrg {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.malicia.mrg to javafx.fxml;
    exports com.malicia.mrg;
}