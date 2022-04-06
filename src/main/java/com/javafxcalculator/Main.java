package com.javafxcalculator;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {
    @Override
    public void start(Stage stage){
        stage.setTitle("XYZ");
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.initStyle(StageStyle.DECORATED);


        stage.setScene(AppController.mainScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}