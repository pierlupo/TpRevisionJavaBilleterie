package org.example.gestionBilleterie;

public interface BilleterieService {

    //utilisation ds Billeterie
    default void addClient(String nom, String prenom, String email){};

    //utilisation Billeterie et Client
    public void acheterBillet(Client client);
}
