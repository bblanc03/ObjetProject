package controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

public class CatalogueController {

	@FXML 
	AnchorPane anchorPane;
	
	@FXML
	AnchorPane ancOption;
	
	@FXML
	AnchorPane ancRecherche;
	
	@FXML
	AnchorPane ancDoc;
	
	//Radio Group Radio
	//TextField search action
	//Effacer btn action
	
	public void clearAncDoc() {
	    if (ancDoc != null) {
	        System.out.println("Before clearing: " + ancDoc.getChildren());
	        ancDoc.getChildren().clear();
	        ancDoc.layout();
	        System.out.println("After clearing: " + ancDoc.getChildren());
	    } else {
	        System.out.println("ancDoc is null!");
	    }
	}
	
	public void loadCatalogueDoc() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CatalogueDoc.fxml"));
	        Parent docContent = loader.load();
	        ancDoc.getChildren().setAll(docContent); // Replace all current content
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public void loadCatalogueAD() {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Adherent.fxml"));
	        Parent docContent = loader.load();
	        ancDoc.getChildren().setAll(docContent); // Replace all current content
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	@FXML
	private void initialize() {
		loadCatalogueDoc();
	}


	
}
