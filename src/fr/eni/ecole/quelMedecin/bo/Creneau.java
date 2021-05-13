package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

/** Classe qui représente un Créneau horaire
 *
 * @author laz_R
 * @version 1.0
 */
public class Creneau {

    //Attributs d'instances
    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecin;

    //Attributs de classe

    // Méthodes

    /** Constructeur avec tous les paramètres.
     *
     * @param heureDebut LocalTime
     * @param duree int
     * @param medecin MedecinGeneraliste
     */
    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;

        // Ajoute "ce créneau" au médecin lié à l'instance concernée
        this.medecin.ajouterCreneau(this);

    }

    public MedecinGeneraliste getMedecin() {
        return this.medecin;
    }

    /** Méthode d'affichage d'un créneau horaire.
     */
    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
                this.heureDebut,
                this.heureDebut.plusMinutes(this.duree),
                this.duree);
    }
}
