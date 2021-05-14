package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends MedecinGeneraliste {

    private String specialite;

    public int tarif;


    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;

    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux, String specialite, int tarif) {
        this(nom, prenom, numeroDeTelephone, adresse, specialite, tarif);
        this.creneaux = creneaux;
    }

    @Override
    public void afficher() {
        System.out.printf("%s %s%nTéléphone : %s%nTarif : %d€%nAdresse :%n", this.nom, this.prenom, this.numeroDeTelephone, this.tarif);
        this.adresse.afficher();
        System.out.println("Créneaux :");
        for (int i = 0; i < this.creneaux.length ; i++) {
            if (this.creneaux[i] == null) {
                break;
            }
            this.creneaux[i].afficher();
        }
    }

}
