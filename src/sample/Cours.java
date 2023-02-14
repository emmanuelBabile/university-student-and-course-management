package sample;

public class Cours {
    private String codeCours;
    private String nomCours;
    private int coeffCours;
    private String niveau;
    private String filiere;

    public Cours(String codeCours, String nomCours, int coeffCours, String niveau, String filiere) {
        this.codeCours = codeCours;
        this.nomCours = nomCours;
        this.coeffCours = coeffCours;
        this.niveau = niveau;
        this.filiere = filiere;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public void setCodeCours(String codeCours) {
        this.codeCours = codeCours;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public int getCoeffCours() {
        return coeffCours;
    }

    public void setCoeffCours(int coeffCours) {
        this.coeffCours = coeffCours;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}
