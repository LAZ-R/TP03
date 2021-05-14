package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Scanner;

/** Classe qui représente un médecin généraliste.
 *
 * @author laz_R
 * @version 1.1
 */
public class MedecinGeneraliste extends Personne{

    // Attributs d'instance
    protected Creneau[] creneaux = new Creneau[15];

    // Attributs de classe
    public static int tarif = 25;

    // Méthodes

    /** Constructeur avec tous les paramètres sauf "Crenaux"
     *
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param adresse Adresse
     */
    public MedecinGeneraliste(String nom,
                              String prenom,
                              String numeroDeTelephone,
                              Adresse adresse) {

        super(nom, prenom, numeroDeTelephone, adresse);
    }

    /** Constructeur avec tous les paramètres
     *
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param adresse Adresse
     * @param creneaux Creneau[]
     */
    public MedecinGeneraliste(String nom,
                              String prenom,
                              String numeroDeTelephone,
                              Adresse adresse,
                              Creneau[] creneaux) {
        this(nom, prenom, numeroDeTelephone, adresse);
        this.creneaux = creneaux;
    }

    public String getNom() {
        return this.nom;
    }

    public String getNomComplet() {
        String nomComplet = this.nom.toUpperCase() + " " + this.prenom;
        return nomComplet;
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

    /** Méthode d'affichage des informations du médecin généraliste.<br>
     *  Boucle pour l'affichage des crénaux propres à ce médecin.
     */
    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %s%nTarif : %d€%nAdresse :%n", this.nom, this.prenom, super.getNumeroDeTelephone(), tarif);
        this.adresse.afficher();
        System.out.println("Créneaux :");
        for (int i = 0; i < this.creneaux.length ; i++) {
            if (this.creneaux[i] == null) {
                break;
            }
            this.creneaux[i].afficher();
        }
    }

    /** Méthode d'ajout de crénaux horaires.<br>
     *  Boucle qui ajoute un objet de type Creneau,<br>
     *  dans un tableau de Creneaux propre à ce médecin,<br>
     *  si cette case est vide.
     *
     * @param creneau Creneau
     */
    public void ajouterCreneau(Creneau creneau) {
        for (int i = 0; i < this.creneaux.length ; i++) {
            if (this.creneaux[i] == null) {
                this.creneaux[i] = creneau;
                break;
            }
        }
    }
}
