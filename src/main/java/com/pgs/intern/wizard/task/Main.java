package com.pgs.intern.wizard.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation((getClass().getResource("/sample.fxml")));
        TabPane tabpane = loader.load();
        tabpane.getStyleClass().add("wizard");
        Controller controler = loader.getController();

        Scene scena = new Scene(tabpane);
        scena.getStylesheets().add(this.getClass().getResource("/tab-pane-as-wizard.css").toExternalForm());
        primaryStage.setTitle("Basic Wizard App");
        primaryStage.setScene(scena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
