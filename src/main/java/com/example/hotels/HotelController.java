package com.example.hotels;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.hotels.model.Hotel;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class HotelController implements Initializable {
        @FXML
        private AnchorPane hotelParent;
        public AnchorPane getParent(){
                return hotelParent;
        }

        @FXML
        private Label hotel_name;

        @FXML
        private Label hotel_price;

        @FXML
        private ImageView image_energy;

        @FXML
        private ImageView image_hotel;


        public void setData(Hotel hotel ) throws IOException {
                Image image = new Image(hotel.getImageSource());
                image_hotel.setImage(image);

                Image image2 = new Image(hotel.getImageEnergySource());
                image_energy.setImage(image2);

                hotel_price.setText(hotel.getPrice());
                hotel_name.setText(hotel.getName());


        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
}



