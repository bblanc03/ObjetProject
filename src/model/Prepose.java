package model;

import java.io.Serializable;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Prepose extends Personne implements Serializable {
	private static final long serialVersionUID = -5296672519460246263L;

	//Instances
	//private SimpleIntegerProperty numEmp;
	private StringProperty nom;
	private StringProperty prenom;
	private StringProperty adresse;
	private StringProperty tel;
	private StringProperty password;
	
	
	public Prepose(String nom, String prenom, String adresse, String telephone) {
		super(nom, prenom, adresse, telephone);
	}
	
}
