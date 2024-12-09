package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.collections.ObservableList;
import model.Livre;
import model.Personne;
import model.Prepose;

public class GestionIOPrepose {
	static boolean dejaOuvert = false;
	private GestionIOPrepose() {

	}
	public static void setStateOuvert(boolean state) {
		dejaOuvert = state;
	}

	private static String fichier = "Personne.txt";
	static String pathFichierTexte = Constantes.REPERTOIRE_DATA + "/" + fichier;
	static ArrayList<Prepose> toWrite = new ArrayList<>();
	static ArrayList<Prepose> toRead = new ArrayList<>();
	
	public static void serealise(ObservableList<Prepose> lstPreposes) throws IOException {
		FileOutputStream file = new FileOutputStream(pathFichierTexte);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toRead = new ArrayList<Prepose>();
		for(Prepose prepose: lstPreposes) {
			toRead.add(prepose);
		}
		out.writeObject(toRead);
		
		out.close();
		file.close();
	}

	public static void lireFichierPrepose() throws ClassNotFoundException, IOException {
		// ArrayList<Prepose> test = null;
		
		FileInputStream file = new FileInputStream(pathFichierTexte);
		ObjectInputStream in = new ObjectInputStream(file);
		//System.out.println(in.readObject() + "reading something");
		toRead = (ArrayList<Prepose>) in.readObject();

		if(dejaOuvert == false) {
			  for (Prepose pers : toRead) { Prepose.setPerpose(pers); }
			 
		}
		

		in.close();
		file.close();
	}

}
