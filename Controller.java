package sample;

import java.io.File;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller {
    
    @FXML
	private void openDialog() {
		final FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showOpenDialog(new Stage());
	}


}