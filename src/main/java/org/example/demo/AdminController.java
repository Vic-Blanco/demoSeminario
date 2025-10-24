package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class AdminController {

    @FXML
    private StackPane contentPane;

    @FXML
    private void initialize() {
        // cargar dashboard por defecto al abrir la vista de administración
        loadContentFromFxml("/org/example/demo/DashboardView.fxml");
    }

    // reemplaza el contenido central por un Node nuevo
    public void setContent(Node node) {
        contentPane.getChildren().setAll(node);
    }

    // ahora cargan FXML en lugar de Labels
    @FXML
    private void showDashboard(ActionEvent event) {
        loadContentFromFxml("/org/example/demo/DashboardView.fxml");
    }

    @FXML
    private void showUsers(ActionEvent event) {
        loadContentFromFxml("/org/example/demo/UsuariosView.fxml");
    }

    @FXML
    private void showSettings(ActionEvent event) {
        loadContentFromFxml("/org/example/demo/AjustesView.fxml");
    }

    @FXML
    private void onClose(ActionEvent event) {
        // cerrar la ventana donde está este controlador
        contentPane.getScene().getWindow().hide();
    }

    // helper para cargar fxml en el contentPane si se desea usar ficheros separados
    public void loadContentFromFxml(String fxmlPath) {
        try {
            Node node = FXMLLoader.load(getClass().getResource(fxmlPath));
            setContent(node);
        } catch (IOException e) {
            e.printStackTrace();
            setContent(new Label("Error cargando: " + fxmlPath));
        }
    }
}
