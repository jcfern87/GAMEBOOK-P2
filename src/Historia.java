import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Historia extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
        
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