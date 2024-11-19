package utils;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GestionVue {

	
	private static GestionVue instance;
	private Stage stage;
	
	public static GestionVue getInstance() {
		if(instance == null) {
			instance = new GestionVue();
		}
		return instance;
	}
	
	public void initialiseStage(Stage stage) {
		this.stage = stage;
	}
	
	public void chargerVuePrincipale(String titreVue, String fichierFXML) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fichierFXML));
		Parent root = loader.load();
		stage.setScene(new Scene(root));
		stage.centerOnScreen();
		stage.setTitle("Project Playground");
		stage.show();
	}
	
	
	// probably not needed
	public void chargerDialogue(String titreVue, String fichierFXML) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fichierFXML));
		try {
			Stage stage = new Stage();
			Parent root = loader.load();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle(titreVue);
			stage.setScene(new Scene(root));
			stage.showAndWait();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
