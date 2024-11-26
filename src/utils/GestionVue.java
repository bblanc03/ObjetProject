package utils;

import java.io.IOException;
import java.util.HashMap;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GestionVue {

	private static GestionVue instance;
	private Stage stage;

	HashMap<String, Stage> mapStages = new HashMap<>();
	HashMap<String, FXMLLoader> mapLoaders = new HashMap<>();

	public static GestionVue getInstance() {
		if (instance == null) {
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
		stage.setTitle(titreVue);
		stage.show();

		mapStages.put(titreVue, stage);
		mapLoaders.put(titreVue, loader);
	}

	// probably not needed --Zach -> Yes i think we need it
	public void chargerDialogue(String titreVue, String fichierFXML) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fichierFXML));
		try {
			Parent root = loader.load();
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setTitle(titreVue);
			stage.setScene(new Scene(root));
			stage.showAndWait();

			mapStages.put(titreVue, stage);
			mapLoaders.put(titreVue, loader);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Fermer Vue
	public void fermerVue(String titreVue) {
		Stage stage = mapStages.get(titreVue);
		System.out.println("out");
		if (stage != null) {
			stage.close();
			mapStages.remove(titreVue);
			mapLoaders.remove(titreVue);
			System.out.println("Fenetre ferme");
		}
	}

	public <T> T chargerVueAvecController(String fichierFXML) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fichierFXML)); 
		Parent root = loader.load(); Scene scene = new Scene(root); 
		stage.setScene(scene); stage.show(); 
		return loader.getController();  
	}

}
