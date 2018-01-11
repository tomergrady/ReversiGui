package ReversiGUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {



    @FXML
    private ColorPicker Player1Color;

    @FXML
    private ColorPicker Player2Color;

    @FXML
    private ChoiceBox<String> WhoStarts;

    @FXML
    private ChoiceBox<Integer> BoardSize;
    @FXML
    private Button MenuButton;

    @FXML
    protected void mainMenu() throws IOException {

        Stage primaryStage = (Stage) MenuButton.getScene().getWindow();

        GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("MenuControllerFXML.fxml"));
        Scene scene = new Scene(root, 640, 500);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setTitle("Reversi");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        WhoStarts.getItems().addAll("Player 1", "Player 2");
        for(int i = 4; i < 20; i++) {
            BoardSize.getItems().add(i);
        }
    }


}
