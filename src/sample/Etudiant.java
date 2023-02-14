package sample;


import java.time.LocalDate;

public class Etudiant {
    private String cne;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String lieuDeNaissance;
    private String sexe;

    public Etudiant(String cne, String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String sexe) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.sexe = sexe;
    }

    public String getCne() { return cne; }

    public void setCne(String cne) { this.cne = cne; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getDateDeNaissance() { return dateDeNaissance; }

    public void setDateDeNaissance(String dateDeNaissance) { this.dateDeNaissance = dateDeNaissance; }

    public String getLieuDeNaissance() { return lieuDeNaissance; }

    public void setLieuDeNaissance(String lieuDeNaissance) { this.lieuDeNaissance = lieuDeNaissance; }

    public String getSexe() { return sexe; }

    public void setSexe(String sexe) { this.sexe = sexe; }
}