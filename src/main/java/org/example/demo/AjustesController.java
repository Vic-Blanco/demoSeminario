package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class AjustesController {

    @FXML
    private CheckBox notifsCheck;

    @FXML
    private CheckBox darkThemeCheck;

    @FXML
    private void initialize() {
        // valores por defecto (puedes cargarlos desde Preferences si lo deseas)
        if (notifsCheck != null) notifsCheck.setSelected(true);
        if (darkThemeCheck != null) darkThemeCheck.setSelected(false);
    }

    @FXML
    private void onGuardar() {
        String msg = "Ajustes guardados.\nNotificaciones: " + (notifsCheck.isSelected() ? "ON" : "OFF")
                + "\nTema oscuro: " + (darkThemeCheck.isSelected() ? "ON" : "OFF");
        Alert a = new Alert(Alert.AlertType.INFORMATION, msg, ButtonType.OK);
        a.setHeaderText(null);
        a.showAndWait();

        // TODO: persistir ajustes (Preferences, archivo o DB) según necesidad
    }
}
