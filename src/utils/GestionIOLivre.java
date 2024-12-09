package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Livre;
import model.Prepose;
import model.Registre;

public class GestionIOLivre {
	Registre registre;
	static Boolean fileRead = false;
	static String nomFichier = "Livres.txt";
	static String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;
	static String pathFichierWrite= "data"; 
	static ArrayList<Livre> toWrite = new ArrayList<>();
	static ArrayList<Livre> toRead = new ArrayList<>();
	
	
	// Constructeur prive qui empeche l'instanciation
		private GestionIOLivre() {
			throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
		}
		
		public static void ecrireFichierLivre(Livre livre) throws IOException, ClassNotFoundException {
			toWrite = new ArrayList<>(Livre.getListLivre());
			toWrite.add(livre);
		}
		
		public static void serealise(ObservableList<Livre> lstLivres) throws IOException {
			FileOutputStream file = new FileOutputStream(pathFichierWrite + "/Livres.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			toRead = new ArrayList<Livre>();
			for(Livre livre: lstLivres) {
				toRead.add(livre);
			}
			out.writeObject(toRead);
			
			out.close();
			file.close();
		}
		
		public static void lireFichierLivre() throws IOException, ClassNotFoundException {
			
			File fileObject = new File(pathFichierWrite + "/Livres.txt");			
			if (fileObject.length() > 0) {
				
				FileInputStream file = new FileInputStream(pathFichierWrite + "/Livres.txt");
				ObjectInputStream in = new ObjectInputStream(file);
				System.out.println("lecture de fichier");
				toRead = (ArrayList<Livre>)in.readObject();
				
				in.close();
				file.close();
			}
		}

		public static ObservableList<Livre> chargerFichier(){
			
			File written = new File(Constantes.REPERTOIRE_DATA + "/" + nomFichier);
			if(written.length() == 0) {
				if (!fileRead) {
					//System.out.println("file reading Livre");
					

					ObservableList<Livre> listeLivres = FXCollections.observableArrayList();

					try (InputStream inStream = Livre.class.getResourceAsStream(pathFichierTexte);
							Scanner lecteur = new Scanner(inStream)) {

						lecteur.useDelimiter(",|\\n");

						while (lecteur.hasNextLine()) {
							String numDoc = lecteur.next().trim();
							String titre = lecteur.next().trim();
							String date = lecteur.next().trim();
							String auteur = lecteur.next().trim();
							

							Livre livre = new Livre(numDoc, titre, date, auteur);

							listeLivres.add(livre);
						}
						inStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(listeLivres);
					return listeLivres;
				}
			} else {
				try {
					System.out.println("other file Livre");
					FileInputStream file = new FileInputStream(pathFichierWrite + "/Livres.txt");
					ObjectInputStream in = new ObjectInputStream(file);
					System.out.println("lecture de fichier");
					toRead = (ArrayList<Livre>)in.readObject();
					ObservableList<Livre> listeLivres = FXCollections.observableArrayList();
					
					for(Livre livre : toRead) {
					//	System.out.println(livre + " from other file");
						listeLivres.add(livre);
					}
					
					in.close();
					file.close();
					
					return listeLivres;
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		
			
			return null;

		}
		
		public static void setFileRead() {
			fileRead = true;
		}
}