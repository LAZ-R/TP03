package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Scanner;

public class MedecinGeneraliste {



    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private Creneau[] creneaux = new Creneau[15];

    public static int tarif = 25;



    // MÉTHODES

    public MedecinGeneraliste() {
        this.nom = "inconnu";
        this.prenom = "inconnu";
        this.numeroDeTelephone = "inconnu";
        this.adresse = null;
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.creneaux = creneaux;
    }

    public String getNom() {
        return this.nom;
    }

    public String getNumeroDeTelephone() {
        return this.numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public static int getTarif() {
        return tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }


    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %s%nTarif : %d€%nAdresse :%n", this.nom, this.prenom, this.numeroDeTelephone, MedecinGeneraliste.getTarif());
        this.adresse.afficher();
        System.out.println("Créneaux :");
        for (int i = 0; i < this.creneaux.length ; i++) {
            this.creneaux[i].afficher();
        }
    }

    public void ajouterCreneau(Creneau creneau) {
        for (int i = 0; i < this.creneaux.length ; i++) {
            if (this.creneaux[i] == null) {
                this.creneaux[i] = creneau;
                break;
            }
        }
    }
}
