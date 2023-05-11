package com.example.hotels;

import com.example.hotels.model.Hotel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.VBox;


import java.io.IOException;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class Controller implements Initializable {

        @FXML
        private GridPane HotelContainer;

        @FXML
        private ImageView search_icon;

        @FXML
        private TextField text_search;


        @Override
        public void initialize (URL locations, ResourceBundle resources) {
                System.out.println("Controler");
                int column = 0;
                int row = 0;

                List<Hotel> Lista = Hotel_list();
                try {
                        for (Hotel h : Lista) {

                                FXMLLoader fxmlLoader = new FXMLLoader();
                                fxmlLoader.setLocation(getClass().getResource("Hotel.fxml"));
                                VBox hotelbox = fxmlLoader.load();
                                HotelController hotControler = fxmlLoader.getController();
                                hotControler.setData(h);

                                if (column == 2) {
                                        column = 0;
                                        ++row;
                                }
                                HotelContainer.add(hotelbox, column++, row);
                                GridPane.setMargin(hotelbox,new Insets(10));


                        }

                } catch (IOException e) {
                        e.printStackTrace();
                }


        }


        private List<Hotel> Hotel_list(){
                List<Hotel> ls = new ArrayList<>();
                Hotel h = new Hotel();
                h.setImageSource("images/hotel1.png");
                ls.add(h);

                h = new Hotel();
                h.setImageSource("images/hotel1.png");
                ls.add(h);


                return ls;
        }





    }


