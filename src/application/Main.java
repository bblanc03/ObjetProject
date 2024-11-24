package application;
	

import controller.AccordionGestionController;
import controller.CatalogueController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import utils.GestionVue;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private static Stage stage;
	GestionVue gestionVue;

	@Override
	public void start(Stage primaryStage) throws Exception {
		gestionVue = GestionVue.getInstance();
		
	    //FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
	    gestionVue.initialiseStage(primaryStage);
	    gestionVue.chargerVuePrincipale("Sorcier", "/fxml/MainView.fxml");
	    
	    
	stage = primaryStage;
	   // Parent root = loader.load();
	   // Scene scene = new Scene(root);
	   // primaryStage.setScene(scene);
	   // primaryStage.setTitle("Project Playground");
	   // primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
		//System.out.println("hello");
	}
	
	public static Stage getStage() {
		return stage;
	}
}