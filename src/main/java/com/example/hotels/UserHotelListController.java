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
import java.util.List;
import java.util.ResourceBundle;

public class UserHotelListController implements Initializable {

    ObservableList<Node> hotels = FXCollections.observableArrayList();
    @FXML
    ListView<Node> userHotelList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader4 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader7 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        userHotelList.setItems(hotels);
        Node fxmlObject = null;
        Node fxmlObject2 = null;
        Node fxmlObject4 = null;
        Node fxmlObject7 = null;

        try {
            fxmlObject = loader.load();
            fxmlObject2 = loader2.load();
            fxmlObject4 = loader4.load();
            fxmlObject7 = loader7.load();

            Hotel hotel = new Hotel();
            hotel.setPrice("$50");
            hotel.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/hotel1.png");
            hotel.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController = (HotelController) loader.getController();

            hotelController.setData(hotel);

            hotels.add(fxmlObject);

            Hotel hotel2 = new Hotel();
            hotel2.setPrice("$60");
            hotel2.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house2.jpg");
            hotel2.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController2 = (HotelController) loader2.getController();

            hotelController2.setData(hotel2);

            hotels.add(fxmlObject2);

            Hotel hotel4 = new Hotel();
            hotel4.setPrice("$30");
            hotel4.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house4.jpg");
            hotel4.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController4 = (HotelController) loader4.getController();

            hotelController4.setData(hotel4);

            hotels.add(fxmlObject4);

            Hotel hotel7 = new Hotel();
            hotel7.setPrice("$35");
            hotel7.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house7.jpg");
            hotel7.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController7 = (HotelController) loader7.getController();

            hotelController7.setData(hotel7);

            hotels.add(fxmlObject7);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
