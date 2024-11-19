package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class Registre {
		
		private static Registre instance;

		private final ObservableList<Document> listeDocument = FXCollections.observableArrayList();
		private final ObservableList<Livre> listeLivre = FXCollections.observableArrayList();
		private final ObservableList<Periodique> listePeriodique = FXCollections.observableArrayList();
		private final ObservableList<DVD> listeDVD = FXCollections.observableArrayList();
		
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
		
		public void getListeDocument(ObservableList<Document> liste) {
			listeDocument.setAll(liste);
		}
		
		public void getListeLivre(ObservableList<Livre> liste) {
			listeLivre.setAll(liste);
		}
		
		public void getListePeriodique(ObservableList<Periodique> liste) {
			listePeriodique.setAll(liste);
		}
		
		public void getListeDVD(ObservableList<DVD> liste) {
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
