package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NuevaVistaController {
    @FXML
    private Label mensajeLabel;

    @FXML
    private void initialize() {
        // opcional: lógica de inicialización
        // mensajeLabel.setText("hola seminario"); // ya está en el FXML
    }
}
