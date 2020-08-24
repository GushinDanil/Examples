import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GuiCalculatorPerimetr  extends CalculatorPerimetr{




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
calc_button.setOnAction(event ->
{
     Integer a =Integer.parseInt( high_field.getText());
     Integer b =Integer.parseInt( side_field.getText());
     int aa=a;
     int bb=b;
    res_field.setText(String.valueOf( Matematica( a,b)));


});

    }
}
