/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseteorema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author crist
 */
public class loginFX extends Application {
       @Override
    public void start(Stage stage) throws Exception {
          Parent root = FXMLLoader.load(getClass().getResource("loginFXML.fxml"));
          Scene scene = new Scene(root);
          stage.initStyle(StageStyle.TRANSPARENT);
          stage.setScene(scene);
          scene.setFill(Color.TRANSPARENT);
          stage.show();
    } 
    public static void main(String[] args) {
        launch(args);
    }


}
