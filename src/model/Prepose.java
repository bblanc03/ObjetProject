package model;

import java.io.IOException;
import java.io.Serializable;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utils.GestionIOPersonne;

public class Prepose extends Personne implements Serializable {
	private static final long serialVersionUID = -5296672519460246263L;


	// Instances
	private IntegerProperty numEmp;
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty tel;
	private StringProperty password;
	private static ObservableList<Prepose> obsListPrepose = FXCollections.observableArrayList();

public Prepose(String nom, String prenom, String adresse, String telephone) {
	super(nom, prenom, adresse, telephone);
}


	public StringProperty getPasswordProperty() {
		return password;
	}

	public String getPassword() {
		return password.get();
	}

	public void setPassword(SimpleStringProperty password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static void setPerpose(Prepose prepo) {
		System.out.println("adding.....");
		obsListPrepose.add(prepo);
	}

	public static ObservableList<Prepose> getObservableListPrepose() {
		return obsListPrepose;
	}

	public static void setObservableListPrepose(ObservableList<Prepose> list) {
		obsListPrepose = list;
	}

	public static void removePrepose(Prepose remove) throws IOException {
		obsListPrepose.remove(remove);
		GestionIOPersonne.supprimerPersonne(remove);
	}

	
	
	

}
