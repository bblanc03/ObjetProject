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
		  System.out.println(personne.getNom() + " this is the name of the person");
		  out.writeObject(personne);
		  
		  out.close(); 
		  file.close();
		 
		System.out.println("file written to " + fichier);
		lireFichierPersonne();
		
	}
	
	public static void lireFichierPersonne() throws ClassNotFoundException, IOException {
		Personne test = null;
		FileInputStream file = new FileInputStream(pathFichierTexte);
        ObjectInputStream in = new ObjectInputStream(file);
        
        test = (Personne) in.readObject();
        System.out.println("what you are looking for: " + test.getNom());
        in.close();
        file.close();
	}
}
