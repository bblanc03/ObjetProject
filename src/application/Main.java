package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private static Stage stage;
	@Override
	public void start(Stage primaryStage) throws Exception {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		
		stage = primaryStage;
	    Parent root = loader.load();
	    Scene scene = new Scene(root);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Project Playground");
	    primaryStage.show();
	    System.out.println("test");
	    System.out.println("work");
	}
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("hello");
	}
	
	public static Stage getStage() {
		return stage;
	}
}
