package org.eduardo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindow extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui/mainwindow.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("JavaFx, Gradle y JFoenix");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
