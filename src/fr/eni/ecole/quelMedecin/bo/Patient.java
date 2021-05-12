package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/** Classe Patient
 *
 * @author laz_R
 * @version 1.0
 */
public class Patient {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private String sexeString;
    private long numeroDeSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;


    /** Constructeur sans paramètres
     *  Il attribue des valeurs nulles ou assimilées
     */
    public Patient() {
        this.nom = "inconnu";
        this.prenom = "inconnu";
        this.numeroDeTelephone = "inconnu";
        this.sexe = '0';
        this.numeroDeSecuriteSociale = 0L;
        this.dateDeNaissance = null;
        this.commentaires = null;
    }

    /** Constructeur avec tous les paramètres sauf commentaire
     *
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param sexe char
     * @param numeroDeSecuriteSociale long
     * @param dateDeNaissance LocalDate
     */
    public Patient(String nom,
                   String prenom,
                   String numeroDeTelephone,
                   char sexe,
                   long numeroDeSecuriteSociale,
                   LocalDate dateDeNaissance) {

        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;

        switch (sexe) {
            case 'F':
                sexeString = "Féminin";
                break;
            case 'M':
                sexeString = "Masculin";
                break;
            default:
                sexeString = "Autre";
        }

        this.commentaires = "[aucun commentaire]";
    }

    /**
     * Constructeur avec tous les paramètres
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param sexe char
     * @param numeroDeSecuriteSociale long
     * @param dateDeNaissance LocalDate
     * @param commentaires String
     */
    public Patient(String nom,
                   String prenom,
                   String numeroDeTelephone,
                   char sexe,
                   long numeroDeSecuriteSociale,
                   LocalDate dateDeNaissance,
                   String commentaires) {

        this(nom,prenom,numeroDeTelephone,sexe,numeroDeSecuriteSociale,dateDeNaissance);

        if (commentaires == null) {
            this.commentaires = "[aucun commentaire]";
        }
        else {
            this.commentaires = commentaires;
        }
    }

    /**
     * Méthode d'affichage des informations d'un patient
     */
    public void afficher() {
        System.out.printf(
                "%s %s%nTéléphone : %s%nSexe : %s%nNuméro de sécurité sociale : %d%nDate de naissance %s%nCommentaires : %s%n",
                this.nom.toUpperCase(),
                this.prenom,
                this.numeroDeTelephone,
                this.sexeString,
                this.numeroDeSecuriteSociale,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires
        );
    }

}
