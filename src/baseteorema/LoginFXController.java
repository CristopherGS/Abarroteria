/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseteorema;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author crist
 */
public class LoginFXController implements Initializable {

    @FXML
    private JFXTextField txtuser;
    @FXML
    private JFXPasswordField txtpass;
    @FXML
    private JFXButton btningresar;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView btnexit;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void auntenticar(ActionEvent event) {
        System.out.println("contraseña ->>> " + txtpass.getText());
    }

    @FXML
    private void salir(MouseEvent event) {
        Stage actual = (Stage) txtpass.getScene().getWindow();
        actual.close();
    }

}
