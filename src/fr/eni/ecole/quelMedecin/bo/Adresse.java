package fr.eni.ecole.quelMedecin.bo;

/** Classe qui représente une adresse
 *
 * @author laz_R
 * @version 1.0
 */
public class Adresse {

    private String mentionsComplementaires;
    private int numeroDeLaVoie;
    private String complementNumeroVoie;
    private String nomDeLaVoie;
    private int codePostal;
    private String nomDeLaCommune;


    /** Constructeur sans paramètres
     *  Il attribue des valeurs nulles ou assimilées.
     */
    /*
    public Adresse() {
        this.numeroDeLaVoie = 0;
        this.complementNumeroVoie = null;
        this.nomDeLaVoie = "nom de la voie inconnu";
        this.codePostal = 0;
        this.nomDeLaCommune = "NOM DE LA COMMUNE INCONNU";
        this.mentionsComplementaires = null;
    }*/

    /** Constructeur avec paramètres sauf "mentions complémentaires"
     *  Il attribue une valeur null aux mentions complémentaires
     *
     * @param numeroDeLaVoie int
     * @param complementNumeroVoie String
     * @param nomDeLaVoie String
     * @param codePostal int
     * @param nomDeLaCommune String
     */
    public Adresse(int numeroDeLaVoie,
                   String complementNumeroVoie,
                   String nomDeLaVoie,
                   int codePostal,
                   String nomDeLaCommune) {

        this.numeroDeLaVoie = numeroDeLaVoie;
        this.complementNumeroVoie = complementNumeroVoie;
        this.nomDeLaVoie = nomDeLaVoie;
        this.codePostal = codePostal;
        this.nomDeLaCommune = nomDeLaCommune.toUpperCase();
        this.mentionsComplementaires = null;

    }

    /** Constructeur avec tous les paramètres
     *
     * @param mentionsComplementaires String
     * @param numeroDeLaVoie int
     * @param complementNumeroVoie String
     * @param nomDeLaVoie String
     * @param codePostal int
     * @param nomDeLaCommune String
     */
    public Adresse(String mentionsComplementaires,
                   int numeroDeLaVoie,
                   String complementNumeroVoie,
                   String nomDeLaVoie,
                   int codePostal,
                   String nomDeLaCommune) {

        this(numeroDeLaVoie, complementNumeroVoie, nomDeLaVoie, codePostal, nomDeLaCommune);
        this.mentionsComplementaires = mentionsComplementaires;

    }

    public void afficher() {
        if (this.mentionsComplementaires != null) {
            if (this.complementNumeroVoie != null) {
                System.out.printf("%s%n%d%s %s%n%05d %s%n",
                        this.mentionsComplementaires,
                        this.numeroDeLaVoie,
                        this.complementNumeroVoie,
                        this.nomDeLaVoie,
                        this.codePostal,
                        this.nomDeLaCommune);
            }
            else {
                System.out.printf("%s%n%d %s%n%05d %s%n",
                        this.mentionsComplementaires,
                        this.numeroDeLaVoie,
                        this.nomDeLaVoie,
                        this.codePostal,
                        this.nomDeLaCommune);
            }

        }
        else {
            if (this.complementNumeroVoie != null) {
                System.out.printf("%d%s %s%n%05d %s%n",
                        this.numeroDeLaVoie,
                        this.complementNumeroVoie,
                        this.nomDeLaVoie,
                        this.codePostal,
                        this.nomDeLaCommune);
            }
            else {
                System.out.printf("%d %s%n%05d %s%n",
                        this.numeroDeLaVoie,
                        this.nomDeLaVoie,
                        this.codePostal,
                        this.nomDeLaCommune);
            }
        }

    }

}
