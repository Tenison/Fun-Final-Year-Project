/*
 * Author: Tenison Osei-Owusu
 * */

package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class rootPaneController {
	@FXML TextField input;
	@FXML Button press;
	
	public rootPaneController(){
		
	}
	
	@FXML
	public void pressButton() {
		System.out.println(input.getText().toString());
		this.useAlert(input.getText().toString());
		input.clear();
	}
	
	private void useAlert (String text) {//Alert to show final results
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Result");
		alert.setContentText("Your height is " + text);
		alert.showAndWait();
	}
}
