package com.example.hotels;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.hotels.model.Hotel;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public AnchorPane hostMainContent;

    public void onLoginHostButton(ActionEvent actionEvent) throws IOException {
        URL resourceToLoad = Main.class.getResource("host-hotel-list.fxml");
        try {
            Node nodeToLoad = FXMLLoader.load(resourceToLoad);
            hostMainContent.getChildren().setAll(nodeToLoad);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}



