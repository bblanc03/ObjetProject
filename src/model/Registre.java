package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.TilePane;
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
	private Accordion accordion;
	private TitledPane titledPane;

	public Registre() {
		chargerDonnees();
	}

	public void chargerDonnees() {
		System.out.println("Charger Donnees");
		listeLivre.setAll(GestionIOLivre.chargerFichier("Livres.txt"));
		GestionIOLivre.setFileRead();
		listePeriodique.setAll(GestionIOPeriodique.chargerFichier("Periodiques.txt"));
		GestionIOPeriodique.setFileRead();
		listeDVD.setAll(GestionIODVD.chargerFichier("DVD.txt"));
		GestionIODVD.setFileRead();
		
		
		listeDocument.addAll(listeLivre);
		listeDocument.addAll(listePeriodique);
		listeDocument.addAll(listeDVD);
		
	}

	// Getters
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

	// Setters
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
		if (instance == null) {
			instance = new Registre();
		}
		return instance;
	}

	// Ajouter
	public void ajouterLivre(Livre livre) {
		listeLivre.add(livre);
		if (!listeDocument.contains(livre)) {
			ajouterDoc(livre);
		}
		
	}

	public void ajouterPeriodique(Periodique periodique) {
		listePeriodique.add(periodique);
		if (!listeDocument.contains(periodique)) {
			ajouterDoc(periodique);
		}
	}

	public void ajouterDVD(DVD dvd) {
		listeDVD.add(dvd);
		if (!listeDocument.contains(dvd)) {
			ajouterDoc(dvd);
		}

	}

	public void ajouterDoc(Document doc) {
		listeDocument.add(doc);
	}

	// Enlever
	public void removeDoc() {
		Document docSelect = document;
		if (docSelect != null) {
			if (listeLivre.contains(docSelect)) {
				listeLivre.remove(docSelect);
			} else if (listePeriodique.contains(docSelect)) {
				listePeriodique.remove(docSelect);
			} else if (listeDVD.contains(docSelect)) {
				listeDVD.remove(docSelect);
			}
			if (listeDocument.contains(docSelect)) {
				listeDocument.remove(docSelect);
			}
		}
	}

	// Setter Docs
	public void setDocument(Document document) {
		this.document = document;
	}
	
	//Getter Setter accordion
	public Accordion getAccordion() {
		return accordion;
	}
	
	public void setAccordion(Accordion accordion) {
		this.accordion = accordion;
	}
	
	//Getter setter titledPane
	public TitledPane getTitledPane() {
		return titledPane;
	}
	
	public void setTitledPane(TitledPane titledPane) {
			this.titledPane = titledPane;	
	}
	

}
