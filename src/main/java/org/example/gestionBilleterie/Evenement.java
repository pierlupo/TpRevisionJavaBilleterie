package org.example.gestionBilleterie;

public class Evenement extends Lieu {

    private static int count = 0;
    private String nom;
    private String date;
    private String heure;
    private Lieu lieu;
    private Integer prix;
    private Integer nombreBilletsVendus;

    public Evenement() {
    }

    public Evenement(String nom, String date, String heure, Lieu lieu, Integer prix) {
        super();
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.prix = prix;
        this.nombreBilletsVendus = ++count;
    }

    public Evenement(String nom, String date, String heure, Lieu lieu, Integer prix, Integer nombreBilletsVendus) {
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        this.prix = prix;
        this.nombreBilletsVendus = nombreBilletsVendus;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getNombreBilletsVendus() {
        return nombreBilletsVendus;
    }

    public void setNombreBilletsVendus(Integer nombreBilletsVendus) {
        this.nombreBilletsVendus = nombreBilletsVendus;
    }

    //méthodes:
    public void checkIfBilletIsAvailable(){

    }

    public void VendreBillet() {

    }

    public void AnnulerVente() {

    }

    @Override
    public String toString() {
        return "evenement{" +
                "nom='" + nom + '\'' +
                ", date='" + date + '\'' +
                ", heure='" + heure + '\'' +
                ", lieu=" + lieu +
                ", prix=" + prix +
                ", nombreBilletsVendus=" + nombreBilletsVendus +
                '}';
    }
}
