module com.uacm.aycs.controlador 
{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.uacm.aycs.controlador to javafx.fxml;
    exports com.uacm.aycs.controlador;
}

