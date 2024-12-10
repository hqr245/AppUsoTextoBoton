package es.ieslosmontecillos.appusotextoboton;

import es.ieslosmontecillos.componentes_caroantonio.CampoTextoBoton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.w3c.dom.ls.LSOutput;

import java.net.URL;
import java.util.ResourceBundle;

public class AppUsoTextoBotonController implements Initializable {

    @FXML
    private CampoTextoBoton campoTextoBoton1;
    @FXML
    private CampoTextoBoton campoTextoBoton2;
    @FXML
    private Label label1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       campoTextoBoton1.setEnAccion(e->{

           System.out.println(campoTextoBoton1.getTexto());

       });
    }


}
