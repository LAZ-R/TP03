package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;

    public static int tarif = 25;

    public MedecinGeneraliste() {

    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
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
    }
}
