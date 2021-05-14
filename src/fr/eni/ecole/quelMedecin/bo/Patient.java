package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/** Classe qui représente un patient.
 *
 * @author laz_R
 * @version 1.1
 */
public class Patient extends Personne{

    // Attributs d'instances
    private char sexe;
    private String sexeString;
    private long numeroDeSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres sauf "Commentaires".
     *
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param sexe char
     * @param numeroDeSecuriteSociale long
     * @param dateDeNaissance LocalDate
     * @param adresse Adresse
     */
    public Patient(String nom,
                   String prenom,
                   String numeroDeTelephone,
                   char sexe,
                   long numeroDeSecuriteSociale,
                   LocalDate dateDeNaissance,
                   Adresse adresse) {

        super(nom, prenom, numeroDeTelephone, adresse);

        this.sexe = sexe;
        this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;

        switch (sexe) {
            case 'F':
                this.sexeString = "Féminin";
                break;
            case 'M':
                this.sexeString = "Masculin";
                break;
            default:
                this.sexeString = "Autre";
        }

        this.commentaires = "[aucun commentaire]";
    }

    /** Constructeur avec tous les paramètres.
     *
     * @param nom String
     * @param prenom String
     * @param numeroDeTelephone String
     * @param sexe char
     * @param numeroDeSecuriteSociale long
     * @param dateDeNaissance LocalDate
     * @param commentaires String
     * @param adresse Adresse
     */
    public Patient(String nom,
                   String prenom,
                   String numeroDeTelephone,
                   char sexe,
                   long numeroDeSecuriteSociale,
                   LocalDate dateDeNaissance,
                   String commentaires,
                   Adresse adresse) {

        this(nom,prenom,numeroDeTelephone,sexe,numeroDeSecuriteSociale,dateDeNaissance, adresse);

        if (commentaires == null) {
            this.commentaires = "[aucun commentaire]";
        }
        else {
            this.commentaires = commentaires;
        }
    }

    /** Méthode d'affichage des informations d'un patient.
     */
    public void afficher() {
        System.out.printf(
                "%s %s%nTéléphone : %s%nSexe : %s%nNuméro de sécurité sociale : %d%nDate de naissance %s%nCommentaires : %s%nAdresse :%n",
                this.nom.toUpperCase(),
                this.prenom,
                this.numeroDeTelephone,
                this.sexeString,
                this.numeroDeSecuriteSociale,
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                this.commentaires
        );
        this.adresse.afficher();
    }

}
