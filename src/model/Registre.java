package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.GestionIODVD;
import utils.GestionIOLivre;
import utils.GestionIOPeriodique;

public final class Registre {
		
		private static Registre instance;

		private final ObservableList<Document> listeDocument = FXCollections.observableArrayList();
		private final ObservableList<Livre> listeLivre = FXCollections.observableArrayList();
		private final ObservableList<Periodique> listePeriodique = FXCollections.observableArrayList();
		private final ObservableList<DVD> listeDVD = FXCollections.observableArrayList();
		private Document document;
		
		
		//Document selectionné
		
		public Registre() {
			chargerDonnees();
		}
		
		public void chargerDonnees() {
			System.out.println("Charger Donnees");
			listeLivre.setAll(GestionIOLivre.chargerFichier("Livres.txt"));
			listePeriodique.setAll(GestionIOPeriodique.chargerFichier("Periodiques.txt"));
			listeDVD.setAll(GestionIODVD.chargerFichier("DVD.txt"));
			listeDocument.addAll(listeLivre);
			listeDocument.addAll(listePeriodique);
			listeDocument.addAll(listeDVD);
		}
		
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

		
		//Ajouter
		public void ajouterLivre(Livre livre) {
			listeLivre.add(livre);
			ajouterDoc(livre);
		}
		public void ajouterPeriodique(Periodique periodique) {
			listePeriodique.add(periodique);
			ajouterDoc(periodique);
		}
		public void ajouterDVD(DVD dvd) {
			listeDVD.add(dvd);
			ajouterDoc(dvd);
		}
		public void ajouterDoc(Document doc) {
			listeDocument.add(doc);
		}
		
		//Enlever
		public void removeDoc() {
			listeDocument.remove(document);
			if (listeLivre.contains(document) ) {
				System.out.println("remove Livre");
				listeLivre.remove(document);
			}
			else if (listePeriodique.contains(document) ) {
				System.out.println("remove Periodique");
				listePeriodique.remove(document);
			}
			else if (listeDVD.contains(document) ) {
				System.out.println("remove DVD");
				listeDVD.remove(document);
			}
		}
		
		
		//Setter Docs
		public void setDocument(Document document) {
			this.document = document;
		}
		
		
		
		
}
