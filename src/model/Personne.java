package model;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Personne {
private StringProperty nom;
private StringProperty prenom;
private StringProperty adresse;
private StringProperty telephone;

private static ArrayList<Personne> lstPersonnes = new ArrayList<Personne>(); // may not be needed if add person function is moved to singleton class
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

public Personne(String nom, String prenom, String adresse,
		String telephone) {
	this.nom = new SimpleStringProperty(nom);
	this.prenom = new SimpleStringProperty(prenom);
	this.adresse = new SimpleStringProperty(adresse);
	this.telephone = new SimpleStringProperty(telephone);
}


//---------------------- maybe move to singleton class --------------------------------

//maybe create a funtion to get an ObservableList

public static void ajouterPersonne(Personne personne) { 
	lstPersonnes.add(personne);
}

public static ArrayList<Personne> getLstPersonne() {
	return lstPersonnes;
}

public static void setObservableList() {
	obsListPersonne.addAll(lstPersonnes);
}

public static ObservableList<Personne> getObservableList(){
	return obsListPersonne;
}


}
