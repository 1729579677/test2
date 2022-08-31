package test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
        @FXML
        private Button loginBtn;

        @FXML
        private Button checkBtn;
        private Stage stage1=new Stage();

        @FXML
        void check(ActionEvent event) {

        }

        @FXML
        void login(ActionEvent event) throws IOException {
                BorderPane borderPane=FXMLLoader.load(this.getClass().getResource("mainController.fxml"));
                stage1.setTitle("主菜单");
                stage1.initModality(Modality.WINDOW_MODAL);

                Scene scene=new Scene(borderPane);
                stage1.setScene(scene);
                stage1.show();
        }

}
