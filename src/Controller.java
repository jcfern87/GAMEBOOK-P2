import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML
    private HBox areaBotao;

    @FXML
    private TextArea areaCapitulo;

    @FXML
    private AnchorPane areaPainel;

    @FXML
    private Button botaoCarregar;

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
        areaCapitulo.clear();
        areaBotao.getChildren().clear();
        if(capitulo.getImg() == null){
            areaCapitulo.setText(capitulo.getCapitulo() + "\n\n" + capitulo.getText() + "\n\n" 
            + capitulo.persoVida() + "\n\n");
            if(!capitulo.getOpcoes().equals("null")){
                areaCapitulo.appendText(capitulo.getOpcoes());
            }
            if(!capitulo.getEdMessage().equals("null")){
                areaCapitulo.appendText(capitulo.getEdMessage());
            }
                 
        }
        else{
            areaCapitulo.setText(capitulo.getImg() + "\n\n" + capitulo.getCapitulo() +
             "\n\n" + capitulo.getText() + "\n\n" 
            + capitulo.persoVida() + "\n\n");
            if(!capitulo.getOpcoes().equals("null")){
                areaCapitulo.appendText(capitulo.getOpcoes());
            }
            if(!capitulo.getEdMessage().equals("null")){
                areaCapitulo.appendText(capitulo.getEdMessage());
            }
            
        }
        if(capitulo.getEsc().size() > 0){
            for(Escolha escolha : capitulo.getEsc()){
                Button botao = new Button(escolha.getTextoEsc());
                botao.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){
                        areaCapitulo.clear();
                        mostrarCapitulo(escolha.getProximoEsc());
                    }
                });

                areaBotao.getChildren().add(botao);
            }

        }
    }

}
