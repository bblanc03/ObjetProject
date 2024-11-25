package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.GestionIOPersonne;

public class Personne implements java.io.Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private transient StringProperty nom;
	private transient StringProperty prenom;
	private transient StringProperty adresse;
	private transient StringProperty telephone;

//private static ArrayList<Personne> lstPersonnes = new ArrayList<Personne>(); // may not be needed if add person function is moved to singleton class
	private static ObservableList<Personne> obsListPersonne = FXCollections.observableArrayList();

	public StringProperty getNomProperty() {
		return nom;
	}

	public String getNom() {
		return nom.get();
	}

	public StringProperty getPrenomProperty() {
		return prenom;
	}

	public String getPrenom() {
		return prenom.get();
	}

	public StringProperty getAdresseProperty() {
		return adresse;
	}

	public String getAdresse() {
		return adresse.get();
	}

	public StringProperty getTelephoneProperty() {
		return telephone;
	}

	public String getTelephone() {
		return telephone.get();
	}

	public Personne(String nom, String prenom, String adresse, String telephone) {
		this.nom = new SimpleStringProperty(nom);
		this.prenom = new SimpleStringProperty(prenom);
		this.adresse = new SimpleStringProperty(adresse);
		this.telephone = new SimpleStringProperty(telephone);
	}

	@Override
	public String toString() {
		return "nom=" + nom.get() + " prenom=" + prenom.get() + " adresse=" + adresse.get() + " telephone=" + telephone.get();
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		System.out.println("Serialisation de: " + nom.get());
		out.writeUTF(nom.get());
		out.writeUTF(prenom.get());
		out.writeUTF(adresse.get());
		out.writeUTF(telephone.get());
	}

	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
		nom = new SimpleStringProperty(in.readUTF());
		System.out.println("Lecture de l'objet: " + nom.get());
		prenom = new SimpleStringProperty(in.readUTF());
		adresse = new SimpleStringProperty(in.readUTF());
		telephone = new SimpleStringProperty(in.readUTF());
	}

//---------------------- maybe move to singleton class --------------------------------

//maybe create a funtion to get an ObservableList

	public static void setPersonne(Personne personne) {
		System.out.println("adding.....");
		obsListPersonne.add(personne);
	}

	public static ObservableList<Personne> getObservableList() {
		return obsListPersonne;
	}

	public static void setObservableList(ObservableList<Personne> list) {
		obsListPersonne = list;
	}

	public static void removePersonne(Personne remove) throws IOException {
		obsListPersonne.remove(remove);
		GestionIOPersonne.supprimerPersonne(remove);
	}
	
	public static Personne toPersonne(Object pers) {
		return (Personne) pers;
	}

}
