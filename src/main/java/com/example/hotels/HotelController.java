package com.example.hotels;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.hotels.model.Hotel;

import java.net.URL;
import java.util.ResourceBundle;

public class HotelController implements Initializable {
        @FXML
        private Label hotel_name;

        @FXML
        private Label hotel_price;

        @FXML
        private ImageView image_energy;

        @FXML
        private ImageView image_hotel;


        public void SetData(Hotel hotel ){
                Image image = new Image(getClass().getResourceAsStream(hotel.getImageSource()));
                image_hotel.setImage(image);

                Image image2 = new Image(getClass().getResourceAsStream(hotel.getImageEnergySource()));
                image_energy.setImage(image2);

                hotel_price.setText(hotel.getPrice());
                hotel_name.setText(hotel.getName());


        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
}



