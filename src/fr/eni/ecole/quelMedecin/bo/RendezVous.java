package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/** Classe qui représente un Rendez-vous.
 *
 * @author laz_R
 * @version 1.0
 */
public class RendezVous {

    // Attributs d'instance
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    // Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param creneau Creneau
     * @param patient Patient
     * @param date LocalDate
     */
    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {

        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    /** Méthode d'affichage du rendez-vous.<br>
     *  Récupère le médecin associé à ce créneau pour l'afficher.<br>
     *  Affiche également les informations du patient associé à ce rendez-vous.
     */
    public void afficher() {
        System.out.printf("Rendez-vous du %s / ", this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneau.afficher();
        System.out.printf("avec le Dr. %s%n", this.creneau.getMedecin().getNomComplet());
        System.out.printf("pour ");
        this.patient.afficher();
    }
}
