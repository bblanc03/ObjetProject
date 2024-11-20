package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class Registre {
		
		private static Registre instance;

		private final ObservableList<Document> listeDocument = FXCollections.observableArrayList();
		private final ObservableList<Livre> listeLivre = FXCollections.observableArrayList();
		private final ObservableList<Periodique> listePeriodique = FXCollections.observableArrayList();
		private final ObservableList<DVD> listeDVD = FXCollections.observableArrayList();
		
		
		//Getters
		public ObservableList<Document> getListeDocument() {
			return listeDocument;
		}
		
		public ObservableList<Livre> getListeLivre() {
			return listeLivre;
		}

		public ObservableList<Periodique> getListePeriodique() {
			return listePeriodique;
		}
		
		public ObservableList<DVD> getListeDVD() {
			return listeDVD;
		}
		
		
		
		//Setters
		public void setListeDocument(ObservableList<Document> liste) {
			listeDocument.setAll(liste);
		}
				
		public void setListePeriodique(ObservableList<Periodique> liste) {
			listePeriodique.setAll(liste);
		}
		
		public void setListeDVD(ObservableList<DVD> liste) {
			listeDVD.setAll(liste);
		}
		
		public void setListeLivre(ObservableList<Livre> liste) {
			listeLivre.setAll(liste);
		}
		
		
		public static Registre getInstance() {
			if(instance == null) {
				instance = new Registre();
			}
			return instance;
		}

}
