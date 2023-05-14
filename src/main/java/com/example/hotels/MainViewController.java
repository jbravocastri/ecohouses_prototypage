package com.example.hotels;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.hotels.model.Hotel;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    public AnchorPane hostMainContent;

    //a ajouter loginbutton actions max

    public void onLoginHostButton(ActionEvent actionEvent) throws IOException {
        URL resourceToLoad = Main.class.getResource("host-hotel-list.fxml");
        try {
            assert resourceToLoad != null;
            Node nodeToLoad = FXMLLoader.load(resourceToLoad);
            hostMainContent.getChildren().setAll(nodeToLoad);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    @FXML
    ImageView cartIcon;

    @FXML
    ImageView bookingIcon;

    @FXML
    private ComboBox myAdultBox;
    //private String[] numberAdult = {"1","2","3","4","5"};

    @FXML
    private ComboBox myChildrenBox;
    //private String[] numberChildren = {"1","2","3","4","5"};

    @FXML
    void SelectNumberAdult(ActionEvent actionEvent) {
        String sa = myAdultBox.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    public void SelectNumberChildren(ActionEvent actionEvent) {
        String sc = myChildrenBox.getSelectionModel().getSelectedItem().toString();
    }

    @FXML
    public void displayCartWindow() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mycartlist.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void displayReservationsWindow() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("reservations.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> listAdult = FXCollections.observableArrayList("1","2","3","4","5");
        myAdultBox.setItems(listAdult);
        ObservableList<String> listChildren = FXCollections.observableArrayList("1","2","3","4","5");
        myChildrenBox.setItems(listChildren);
        //myAdultBox.getItems().addAll(numberAdult);
        //myChildrenBox.getItems().addAll(numberChildren);

    }
}



