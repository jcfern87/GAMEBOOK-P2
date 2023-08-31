import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;


public class Controller {

    @FXML
    private TextArea areaCapitulo;

    @FXML
    private Button botaoCarregar;

    @FXML
    private Pane buttonArea;

    HashMap<String, Personagem> personagens;
    HashMap<String, Capitulo> capitulos;

    @FXML
    void carregar(ActionEvent event) {
        Leitor leitor = new Leitor();
        personagens = leitor.lerPerso("rsc/personagens.txt");
        capitulos = leitor.lerCap("rsc/capitulos.txt", personagens);
        Capitulo raiz = capitulos.get("CAPÍTULO 1~~~~~~~~~~~~~~~~~~");
        mostrarCapitulo(raiz);
    }
    void mostrarCapitulo(Capitulo capitulo){
        areaCapitulo.setText(capitulo.getCapitulo() + "\n\n" + capitulo.getText() + "\n\n" 
        + capitulo.persoVida() + "\n\n" + capitulo.getOpcoes());
        if(capitulo.getEsc().size() > 0){
            for(Escolha escolha : capitulo.getEsc()){
                Button botao = new Button(escolha.getTextoEsc());
                botao.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){
                        
                    }
                });
            }

        }
    }

}
