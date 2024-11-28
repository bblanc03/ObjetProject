package application;


import controller.CatalogueController;
import controller.LivreController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Registre;
import utils.GestionVue;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	private static Stage stage;
	GestionVue gestionVue;
	private Registre registre = Registre.getInstance();

	@Override
	public void start(Stage primaryStage) throws Exception {
		gestionVue = GestionVue.getInstance();

		// FXMLLoader loader = new
		// FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		gestionVue.initialiseStage(primaryStage);
		gestionVue.chargerVuePrincipale("MainView", "/fxml/MainView.fxml");

		stage = primaryStage;

	}

	public static void main(String[] args) {
		launch(args);
		// System.out.println("hello");
	}

	public static Stage getStage() {
		return stage;
	}
}