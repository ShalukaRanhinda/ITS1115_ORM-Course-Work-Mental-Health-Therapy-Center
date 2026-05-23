package lk.ijse.therapycenter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.therapycenter.entity.*;

import java.io.IOException;

public class Initializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load((getClass().getResource("/view/LogIn.fxml")));
        Scene scene = new Scene(load);
        scene.getStylesheets().add(getClass().getResource("/style/global.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Mental Health Therapy Center");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}