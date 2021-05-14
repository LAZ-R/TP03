package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class RendezVous {

    // Attributs d'instance
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;



    // Attributs de classe

    // Méthodes

    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {

        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public void afficher() {
        System.out.println(this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneau.afficher();
        System.out.println(this.creneau.getMedecin().getNomComplet());
        this.patient.afficher();
    }
}
