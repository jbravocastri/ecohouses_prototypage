package com.example.hotels;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CartListController implements Initializable {

    private final Image IMAGE_H1  = new Image(getClass().getResourceAsStream("/images/hotel1.png"));
    private final Image IMAGE_H2 = new Image(getClass().getResourceAsStream("/images/house2.jpg"));
    private final Image IMAGE_H3 = new Image(getClass().getResourceAsStream("/images/hotel1.png"));
    private final Image IMAGE_H4 = new Image(getClass().getResourceAsStream("/images/house2.jpg"));
    private final Image IMAGE_H5 = new Image(getClass().getResourceAsStream("/images/hotel1.png"));

    private Image[] listOfImages = {IMAGE_H1, IMAGE_H2, IMAGE_H3, IMAGE_H4, IMAGE_H5};

    @FXML
    Button keepBookingButton;

    @FXML
    private ListView<String> myListCart;

    @FXML
    private Label myLabelHouse;

    @FXML
    ImageView myImageHouseCart;

    String[] cart = {"EcoHouse1, Indonesia", "EcoHouse2, Italy", "EcoHouse3, Greece", "EcoHouse4, France", "EcoHouse4, Portugal"};

    String currentCartList;

    @FXML
    public void displayMessage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("messageBooking.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Show cart list
        myListCart.getItems().addAll(cart);
        myListCart.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentCartList = myListCart.getSelectionModel().getSelectedItem();
                myLabelHouse.setText(currentCartList);

                int selectedIndex = myListCart.getSelectionModel().getSelectedIndex();
                myImageHouseCart.setImage(listOfImages[selectedIndex]);
            }
        });
    }
}



