package com.example.hotels;

import com.example.hotels.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HostHotelListController implements Initializable {

    ObservableList<Node> hotels = FXCollections.observableArrayList();
    @FXML
    ListView<Node> hotelList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        hotelList.setItems(hotels);
        Node fxmlObject = null;
        try {
            fxmlObject = loader.load();
            Hotel hotel = new Hotel();
            hotel.setPrice("$2000");
            hotel.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/hotel1.png");
            hotel.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController = (HotelController) loader.getController();

            hotelController.setData(hotel);

            hotels.add(fxmlObject);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
