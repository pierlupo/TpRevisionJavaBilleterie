package org.example.gestionBilleterie;
import java.util.ArrayList;
import java.util.List;
public class Billeterie implements BilleterieService{

    public String name;
        public List<Evenement> evenement = new ArrayList<>();
        public List<Client> clients;

        public Billeterie() {
        }

        public Billeterie(String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Evenement> getEvenement() {
        return evenement;
    }

    public void setEvenement(List<Evenement> evenement) {
        this.evenement = evenement;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    //ADD Client
    @Override
    public void addClient(String nom, String prenom, String email) {
        Client client = new Client(nom, prenom, email);
        clients.add(client);
    }

    @Override
    public void acheterBillet(Client client) {
        clients.add(client);
    }


}

