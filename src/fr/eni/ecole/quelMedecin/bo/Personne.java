package fr.eni.ecole.quelMedecin.bo;

public class Personne {

    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }
}
