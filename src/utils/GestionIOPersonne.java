package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Personne;

public class GestionIOPersonne {
	private GestionIOPersonne(){
		
	}
	
	private static String fichier = "Personne.txt";
	static String pathFichierTexte =  Constantes.REPERTOIRE_DATA + "/" + fichier;

	public static void ecrireFichierPersonne(Personne personne) throws IOException, ClassNotFoundException{
		
		  FileOutputStream file = new FileOutputStream(pathFichierTexte); 
		  ObjectOutputStream out = new ObjectOutputStream(file); 
		  out.writeObject(personne.toString());
		  
		  out.close(); 
		  file.close();
		 
		System.out.println("file written to " + fichier);
		//lireFichierPersonne();
		
	}
	

}
