package com.example.hotels;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.hotels.model.Hotel;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    Node mainViewNode;
    Node hostNode;
    Node guestNode;
    @FXML
    MenuButton logInMenuButton;
    @FXML
    public AnchorPane hostMainContent;
    @FXML
    public AnchorPane userMainContent;
    @FXML
    public AnchorPane mainViewMainContent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            displayHotelsOnInitialize();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayHotelsOnInitialize() throws IOException {
        URL resourceToLoad = Main.class.getResource("main-view-hotel-list.fxml");
        try {
            mainViewNode = FXMLLoader.load(resourceToLoad);
            hostMainContent.getChildren().setAll(mainViewNode);
        } catch (IOException e) {
            throw new IOException(e);
        }

    }

    public void onLoginHostButton(ActionEvent actionEvent) throws IOException {
        URL resourceToLoad = Main.class.getResource("host-hotel-list.fxml");
        try {
            hostNode = FXMLLoader.load(resourceToLoad);
            userMainContent.getChildren().remove(guestNode);
            userMainContent.getChildren().remove(mainViewNode);
            hostMainContent.getChildren().setAll(hostNode);
        } catch (IOException e) {
            throw new IOException(e);
        }

    }

    public void onLoginGuestButton(ActionEvent actionEvent) throws IOException {

        URL resourceToLoad = Main.class.getResource("user-hotel-list.fxml");
        try {
            guestNode = FXMLLoader.load(resourceToLoad);
            hostMainContent.getChildren().remove(hostNode);
            userMainContent.getChildren().remove(mainViewNode);
            userMainContent.getChildren().setAll(guestNode);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}



