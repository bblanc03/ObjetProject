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
	private final ObservableList<Adherent> listeAdherent = FXCollections.observableArrayList();
	private Document document;
	private Adherent adherent;
	private TitledPane titledPane;

	public Registre() {
		chargerDonnees();
	}

	public void chargerDonnees() {
		System.out.println("Charger Donnees");
		listeLivre.setAll(GestionIOLivre.chargerFichier());
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
	
	public ObservableList<Adherent> getListeAdherent() {
		return listeAdherent;
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
	
	public void setListeAdherent(ObservableList<Adherent> liste) {
		listeAdherent.setAll(liste);
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
	
	public void ajouterAD(Adherent adherent) {
		listeAdherent.add(adherent);
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
	
	public void removeAD() {
		Adherent ad = adherent;
		listeAdherent.remove(ad);
	}

	// Setter Docs
	public void setDocument(Document document) {
		this.document = document;
	}
	
	public Adherent getAD() {
		System.out.println("Get AD");
		return adherent;
	}
	
	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}
	
	public void modifierAdherent(String addresse, String tel) {
		Adherent nouAD;
		nouAD = adherent;
		listeAdherent.remove(adherent);
		nouAD.setAdrese(addresse);
		nouAD.setTel(tel);
		listeAdherent.add(nouAD);
	}
	
	//Getter setter titledPane
	public TitledPane getTitledPane() {
		return titledPane;
	}
	
	public void setTitledPane(TitledPane titledPane) {
			this.titledPane = titledPane;	
	}
	

}
