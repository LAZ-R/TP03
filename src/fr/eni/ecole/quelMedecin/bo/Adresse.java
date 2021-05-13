package fr.eni.ecole.quelMedecin.bo;

/** Classe qui représente une adresse.
 *
 * @author laz_R
 * @version 1.0
 */
public class Adresse {

    // Attributs d'instances
    private String mentionsComplementaires;
    private int numeroDeLaVoie;
    private String complementNumeroVoie;
    private String nomDeLaVoie;
    private int codePostal;
    private String nomDeLaCommune;

    ///Attributs de classe

    // Méthodes

    /** Constructeur sans paramètres.
     */
    public Adresse() {
    }

    /** Constructeur avec paramètres sauf "mentions complémentaires".<br>
     *  Il attribue une valeur nulle aux mentions complémentaires.
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

    /** Constructeur avec tous les paramètres.
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

    /** Methode d'affichage de l'adresse.<br>
     *  4 affichages possibles en fonction des paramètres renseignés.
     */
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
