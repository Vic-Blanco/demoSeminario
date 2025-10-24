package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class UsuariosController {

    @FXML
    private ListView<String> usuariosList;

    @FXML
    private void initialize() {
        // lista de ejemplo
        usuariosList.getItems().addAll("Ana Pérez", "Luis Gómez", "María Ruiz");
    }

    @FXML
    private void onNuevoUsuario() {
        usuariosList.getItems().add("Usuario " + (usuariosList.getItems().size() + 1));
        usuariosList.getSelectionModel().selectLast();
    }

    @FXML
    private void onEliminarUsuario() {
        String sel = usuariosList.getSelectionModel().getSelectedItem();
        if (sel != null) {
            usuariosList.getItems().remove(sel);
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Selecciona un usuario para eliminar.", ButtonType.OK);
            a.showAndWait();
        }
    }
}
