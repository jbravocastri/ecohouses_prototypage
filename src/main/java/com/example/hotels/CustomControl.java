package com.example.hotels;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomControl extends AnchorPane implements Initializable {
    @FXML
    private AnchorPane rootPane;
    @FXML private ImageView imageView;
    @FXML private Label titleLabel;
    @FXML private Label descriptionLabel;

    public CustomControl(Image image, String title, String description) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("custom_control.fxml"));
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        imageView.setImage(image);
        titleLabel.setText(title);
        descriptionLabel.setText(description);
        getChildren().add(rootPane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}