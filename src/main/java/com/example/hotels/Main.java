package com.example.hotels;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;




public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1250, 890);
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }


    }










