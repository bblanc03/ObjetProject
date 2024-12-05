package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Livre;

public class GestionIOLivre {
    static Boolean fileRead = false;
    static String nomFichier = "Livres.txt";
    static String pathFichierTexte = "/" + Constantes.REPERTOIRE_FICHIERS + "/" + nomFichier;
    static String pathFichierWrite = "data"; 
    static ArrayList<Livre> toWrite = new ArrayList<>();
    static ArrayList<Livre> toRead = new ArrayList<>();

    // Private constructor to prevent instantiation
    private GestionIOLivre() {
        throw new UnsupportedOperationException("Utility class - cannot be instantiated");
    }

    // Write a new Livre to the file
    public static void ecrireFichierLivre(Livre livre) throws IOException, ClassNotFoundException {
        System.out.println("Writing to file...");

        // Read the current list from the file first
        File file = new File(pathFichierWrite + "/Livres.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // Read existing data if any
        try (FileInputStream fileIn = new FileInputStream(file);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            if (file.length() > 0) {
                toRead = (ArrayList<Livre>) in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            // If the file is empty or there is an issue with deserialization, start with an empty list
            toRead = new ArrayList<>();
        }

        // Add the new Livre to the list
        toRead.add(livre);

        // Write the updated list back to the file
        try (FileOutputStream fileOut = new FileOutputStream(file);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(toRead);
        }

        System.out.println("Write completed.");
    }

    // Read the file content (Livres) into the list
    public static void lireFichierLivre() throws IOException, ClassNotFoundException {
        File file = new File(pathFichierWrite + "/Livres.txt");
        if (file.exists() && file.length() > 0) {
            try (FileInputStream fileIn = new FileInputStream(file);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                toRead = (ArrayList<Livre>) in.readObject();
                System.out.println("Reading completed: " + toRead);
            }
        } else {
            System.out.println("No data found to read.");
        }
    }

    // Load the books from a text file
    public static ObservableList<Livre> chargerFichier() {
        ObservableList<Livre> listeLivres = FXCollections.observableArrayList();

        if (!fileRead) {
            System.out.println("Reading Livre file...");
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

            // Mark the file as read to avoid re-reading
            fileRead = true;
        }
        
        return listeLivres;
    }

    // Set the file as read (useful for control flags)
    public static void setFileRead() {
        fileRead = true;
    }
}
