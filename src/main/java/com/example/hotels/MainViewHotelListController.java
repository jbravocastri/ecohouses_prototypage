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

public class MainViewHotelListController implements Initializable {

    ObservableList<Node> hotels = FXCollections.observableArrayList();
    @FXML
    ListView<Node> mainViewHotelList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader3 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader4 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader5 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader6 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader7 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader8 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader9 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        FXMLLoader loader10 = new FXMLLoader(getClass().getResource("Hotel.fxml"));
        mainViewHotelList.setItems(hotels);
        Node fxmlObject = null;
        Node fxmlObject2 = null;
        Node fxmlObject3 = null;
        Node fxmlObject4 = null;
        Node fxmlObject5 = null;
        Node fxmlObject6 = null;
        Node fxmlObject7 = null;
        Node fxmlObject8 = null;
        Node fxmlObject9 = null;
        Node fxmlObject10 = null;

        try {
            fxmlObject = loader.load();
            fxmlObject2 = loader2.load();
            fxmlObject3 = loader3.load();
            fxmlObject4 = loader4.load();
            fxmlObject5 = loader5.load();
            fxmlObject6 = loader6.load();
            fxmlObject7 = loader7.load();
            fxmlObject8 = loader8.load();
            fxmlObject9 = loader9.load();
            fxmlObject10 = loader10.load();

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

            Hotel hotel3 = new Hotel();
            hotel3.setPrice("$100");
            hotel3.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house3.jpg");
            hotel3.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController3 = (HotelController) loader3.getController();

            hotelController3.setData(hotel3);

            hotels.add(fxmlObject3);

            Hotel hotel4 = new Hotel();
            hotel4.setPrice("$30");
            hotel4.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house4.jpg");
            hotel4.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController4 = (HotelController) loader4.getController();

            hotelController4.setData(hotel4);

            hotels.add(fxmlObject4);

            Hotel hotel5 = new Hotel();
            hotel5.setPrice("$40");
            hotel5.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house5.jpg");
            hotel5.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController5 = (HotelController) loader5.getController();

            hotelController5.setData(hotel5);

            hotels.add(fxmlObject5);

            Hotel hotel6 = new Hotel();
            hotel6.setPrice("$50");
            hotel6.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house6.jpg");
            hotel6.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController6 = (HotelController) loader6.getController();

            hotelController6.setData(hotel6);

            hotels.add(fxmlObject6);

            Hotel hotel7 = new Hotel();
            hotel7.setPrice("$35");
            hotel7.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house7.jpg");
            hotel7.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController7 = (HotelController) loader7.getController();

            hotelController7.setData(hotel7);

            hotels.add(fxmlObject7);

            Hotel hotel8 = new Hotel();
            hotel8.setPrice("$45");
            hotel8.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house8.jpg");
            hotel8.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController8 = (HotelController) loader8.getController();

            hotelController8.setData(hotel8);

            hotels.add(fxmlObject8);

            Hotel hotel9 = new Hotel();
            hotel9.setPrice("$70");
            hotel9.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house3.jpg");
            hotel9.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController9 = (HotelController) loader9.getController();

            hotelController9.setData(hotel9);

            hotels.add(fxmlObject9);

            Hotel hotel10 = new Hotel();
            hotel10.setPrice("$85");
            hotel10.setImageSource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/house10.png");
            hotel10.setImageEnergySource("file:/home/maax/Cours M1 Semestre 2/PrototypageApplication/src/main/resources/images/energy.png");
            HotelController hotelController10 = (HotelController) loader10.getController();

            hotelController10.setData(hotel10);

            hotels.add(fxmlObject10);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
