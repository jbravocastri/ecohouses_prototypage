package com.example.hotels;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ReservationController implements Initializable {

    @FXML
    ImageView myImageView;
    @FXML
    Button myButtonNext;
    @FXML
    Button myButtonPrevious;

    @FXML
    Label titleHouse1;

    @FXML
    Label energyHouse1;

    @FXML
    Label priceHouse1;

    @FXML
    Label accommodationHouse1;

    Image myImageNext = new Image(getClass().getResourceAsStream("/images/house2.jpg"));
    Image myImagePrevious = new Image(getClass().getResourceAsStream("/images/hotel1.png"));

    public void displayNextImage(){
        myImageView.setImage(myImageNext);
        titleHouse1.setText("EcoHouse2");
        energyHouse1.setText("Energy Rate B");
        priceHouse1.setText("Price : $ 80 / night");
        accommodationHouse1.setText("Accommodation Date :  June 2 - 4, 2023");

    }
    public void displayPreviousImage(){
        myImageView.setImage(myImagePrevious);
        titleHouse1.setText("EcoHouse1");
        energyHouse1.setText("Energy Rate A");
        priceHouse1.setText("Price : $ 75 / night");
        accommodationHouse1.setText("Accommodation Date :  May 1 - 7, 202");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}



