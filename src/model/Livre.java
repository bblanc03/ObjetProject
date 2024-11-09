package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Livre {
	private StringProperty noLivre;
	private StringProperty titre;
	private StringProperty dateParution;
	private StringProperty auteur;
	
	public Livre(String noLivre, String titre, String dateParution, String auteur) {
		super();
		this.noLivre = new SimpleStringProperty(noLivre);
		this.titre = new SimpleStringProperty(titre);
		this.dateParution = new SimpleStringProperty(dateParution);
		this.auteur = new SimpleStringProperty(auteur);
	}

	public StringProperty getNoLivreProperty() {
		return noLivre;
	}
	
	public String getNoLivre() {
		return noLivre.get();
	}

	public StringProperty getTitreProperty() {
		return titre;
	}
	
	public String getTitre() {
		return titre.get();
	}

	public StringProperty getDateParutionProperty() {
		return dateParution;
	}
	
	public String getDateParution() {
		return dateParution.get();
	}

	public StringProperty getAuteuProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		return auteur.get();
	}
	
}
