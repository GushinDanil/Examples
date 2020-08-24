package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class GUICalculatorPerimetr extends CalculatorPerimetr implements Initializable {
    @Override
    public int Matematica(int h, int side) {
        return super.Matematica(h, side);
    }


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField side_field;

    @FXML
    private TextField high_field;

    @FXML
    private TextField res_field;

    @FXML
    private Button calc_button;

    @FXML
    void initialize() {
        calc_button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @FXML
            public void handle(MouseEvent mouseEvent) {
                calc_button.setText("Thanks!");
                System.out.println("Hello");
            }
        });
    }
@FXML
private void handleButtonAction(ActionEvent event)
{
    int h=Integer.parseInt(high_field.getText());
   int s=Integer.parseInt( side_field.getText());
    res_field.setText(String.valueOf( Matematica(h,s)));
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
