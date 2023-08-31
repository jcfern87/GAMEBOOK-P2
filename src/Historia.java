import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Historia extends Application {
    public static void main(String[] args) throws Exception {
        //Inicia a história e organiza os capítulos
        launch(args);
        //raiz.executar();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader FXMLLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = FXMLLoader.load();
        Scene tela = new Scene(root);
        primaryStage.setTitle("Projeto P2");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}