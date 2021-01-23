/*
* Author : Tension Osei-Owusu
*/
package application;
	
import java.io.IOException;

import application.view.rootPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
	private Stage primaryStage; 
	private AnchorPane mainLayout;
	private rootPaneController controller;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Height Calculator tool");
			
			showMainView();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void showMainView() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/rootPane.fxml"));
		
		
        controller = loader.getController();
		mainLayout = loader.load();

		Scene scene = new Scene(mainLayout);
		this.primaryStage.setResizable(false);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();
	}
	
	
}
