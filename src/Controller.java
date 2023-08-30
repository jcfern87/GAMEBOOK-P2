import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button BotaoCarregar;

    @FXML
    private Label TextoCapitulo;

    @FXML
    void carregar(ActionEvent event) {
        TextoCapitulo.setText("Botão pressionado!");
    }

}
