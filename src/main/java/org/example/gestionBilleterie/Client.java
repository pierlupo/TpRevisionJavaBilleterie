package org.example.gestionBilleterie;

import java.util.ArrayList;
import java.util.List;

public class Client{

private static int count = 0;

private String nom;

private String prenom;

private String email;

//public List<Evenement> nombreBilletsAchetes;
public List<Evenement> nombreBilletsAchetes = new ArrayList<>();

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Client.count = count;
    }

    public String getNom() {
        return nom;
    }

    public List<Evenement> getNombreBilletsAchetes() {
        return nombreBilletsAchetes;
    }

    public void setNombreBilletsAchetes(List<Evenement> nombreBilletsAchetes) {
        this.nombreBilletsAchetes = nombreBilletsAchetes;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void acheterBillet(){

    }
    public void annulerAchatBillet(){

    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", nombreBilletsAchetes=" + nombreBilletsAchetes +
                '}';
    }
}
