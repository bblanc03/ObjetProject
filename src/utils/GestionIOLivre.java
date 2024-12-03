package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Livre;
import model.Registre;

public class GestionIOLivre {
	Registre registre;
	static Boolean fileRead = false;
	
	// Constructeur prive qui empeche l'instanciation
		private GestionIOLivre() {
			throw new UnsupportedOperationException("classe utilitaire - ne peut etre instanciee");
		}

		public static ObservableList<Livre> chargerFichier(String nomFichier) {
			
		
			if (!fileRead) {
				System.out.println("file reading Livre");
				String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;

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

				} catch (IOException e) {
					e.printStackTrace();
				}
				return listeLivres;
			}
			return null;

		}
		
		public static void setFileRead() {
			fileRead = true;
		}
}
