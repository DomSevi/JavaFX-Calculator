package com.javafxcalculator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;

public class AppController {
    protected static Scene mainScene;
    private static HashMap<String, Parent> sceneMap = new HashMap<>();

    protected static CalculatorController calculatorController;

    static{
        AppController.calculatorController = prepareScene("calculator","calculator.fxml");
        Scene scene = new Scene(AppController.sceneMap.get("calculator"));
        AppController.initScene(scene);
    }

    private static <T> T prepareScene(String name, String dir) {
        FXMLLoader loader = new FXMLLoader(AppController.class.getResource(dir));
        try {
            Parent root = loader.load();
            AppController.addScene(name, root);
            return loader.getController();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Ustala glowna scene, uzywana tylko przy starcie programu
    protected static void initScene(Scene scene) {
        AppController.mainScene = scene;
    }

    // Dodanie sceny do mapy scen
    protected static void addScene(String name, Parent p) {
        sceneMap.put(name, p);
    }

    // Zmienia dotychczas uzywana scene
    protected static void activateScene(String name) {
        mainScene.setRoot(sceneMap.get(name));
    }
}
