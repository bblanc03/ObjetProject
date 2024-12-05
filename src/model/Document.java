package model;

import java.io.ObjectOutput;
import java.io.Serializable;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6866745363679938550L;
	private transient StringProperty noDocument;
	private transient StringProperty titre;
	private transient StringProperty auteur;
	private transient StringProperty datePublication;
	private transient BooleanProperty etat;
	private transient IntegerProperty pret;
	private transient ObjectProperty<Object> emprunteur;
	private static ObservableList<Document> obsListDoc = FXCollections.observableArrayList();
	private transient String type;
	
	//this is a super class for the other classes
	public Document() {
		
	}
	
	
	//Ajouter etat et emprunter 
	public Document(String noDocument, String titre, String datePublication) {
		this.noDocument = new SimpleStringProperty(noDocument);
		this.titre = new SimpleStringProperty(titre);
		this.datePublication = new SimpleStringProperty(datePublication);
		this.etat = new SimpleBooleanProperty(true);
		this.emprunteur = new SimpleObjectProperty<Object>(null);
		this.pret = new SimpleIntegerProperty(0);
	}
	

	public StringProperty getNoDocumentProperty() {
		return noDocument;
	}
	
	public String getNoDocument() {
		return noDocument.get();
	}

	public StringProperty getTitreProperty() {
		return titre;
	}
	
	public String getTitre() {
		return titre.get();
	}

	public StringProperty getAuteurProperty() {
		return auteur;
	}
	
	public String getAuteur() {
		if (auteur != null) {
			return auteur.get();
		}
		return "";
	}

	public StringProperty getDatePublicationProperty() {
		return datePublication;
	}
	
	public String getDatePublication() {
		return datePublication.get();
	}
	
	public BooleanProperty getEtatProperty() {
		return etat;
	}
	
	public ObjectProperty<Object> getEmprunteurProperty() {
		return emprunteur;
	}
	
	public boolean getEtat() {
		return etat.get();
	}
	
	public Object getEmprunteur() {
		return emprunteur.get();
	}
	
	public void setEtat(Boolean etat) {
		this.etat.set(etat);
	}
	
	public void setEmprunteur(Object adherent) {
		this.emprunteur.set(adherent);
	}
	
	
	public IntegerProperty getPretProperty() {
		return pret;
	}
	
	public void setNoDoc(String noDoc) {
		this.noDocument = new SimpleStringProperty(noDoc);
	}
	
	public void setTitre(String titre) {
		this.titre = new SimpleStringProperty(titre);
	}
	
	public void setDate(String date) {
		this.datePublication = new SimpleStringProperty(date);
	}
	
	@Override
	public String toString() {
		return titre.get();
	}
	
	public String getType() {
		return type;
	}
	
	
	
	//------------------------------------ObservableList------------------------------------------//
	
	
	public static void setDoc(Document doc) {
		obsListDoc.add(doc);
	}

	public static ObservableList<Document> getListDoc(){
		return obsListDoc;
	}

	public static void setListDoc(ObservableList<Document> list) {
		obsListDoc = list;
	}

	public static void removeDoc(Document remove) {
		obsListDoc.remove(remove);
	}
	
}
