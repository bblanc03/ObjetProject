package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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

	public static void ecrireFichierPrepose(Prepose Prepose) throws IOException, ClassNotFoundException {
		 

		FileOutputStream file = new FileOutputStream(pathFichierTexte);
		ObjectOutputStream out = new ObjectOutputStream(file);
		toWrite = new ArrayList<>(Prepose.getObservableListPrepose());
		//toWrite.add(Prepose);
		System.out.println("");
		System.out.println(toWrite);
		System.out.println("");
		out.writeObject(toWrite);

		out.close();
		file.close();

	}
	
	public static void supprimerPrepose(Prepose Prepose) throws IOException {
		
		FileOutputStream file = new FileOutputStream(pathFichierTexte);
		ObjectOutputStream out = new ObjectOutputStream(file);
		ArrayList<Personne> listTemporaire = new ArrayList<>();
		toWrite = new ArrayList<>(Prepose.getObservableListPrepose());
		
		for(Prepose pers: toWrite) {
			if(pers.equals(Prepose) == false) {
				listTemporaire.add(pers);
			}
		}
		
		out.writeObject(listTemporaire);

		out.close();
		file.close();
		
	}

	public static void lireFichierPrepose() throws ClassNotFoundException, IOException {
		// ArrayList<Prepose> test = null;
		
		FileInputStream file = new FileInputStream(pathFichierTexte);
		ObjectInputStream in = new ObjectInputStream(file);
		toRead = (ArrayList<Prepose>) in.readObject();

		if(dejaOuvert == false) {
			System.out.println();
			System.out.println(toRead.size());
			System.out.println(toRead);
			System.out.println();
		/*	for(int i = 0; i < toRead.size()-1; i++) {
				Prepose.setPrepose(toRead.get(i));
			}*/
			
			  for (Prepose pers : toRead) { Prepose.setPerpose(pers); }
			 
		}
		

		in.close();
		file.close();
	}

}
