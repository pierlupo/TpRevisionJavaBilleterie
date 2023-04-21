package org.example.gestionBilleterie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IHM {


    static Scanner sc = new Scanner(System.in);
    static Billeterie billeterie;
    static Client selectedClient;

    public static void main() {

        System.out.println("Pour quel évènement voulez-vous effectuer une réservation? ");
        String eventName = sc.nextLine();

        billeterie = new Billeterie(eventName);
        initialisationBilleterie();
        menu();
    }

    public static void initialisationBilleterie() {

        //Initialisation clients

        List<Client> clients = new ArrayList<>(Arrays.asList(
                new Client("Michel", "Michel", "mich.mich@gmail.com"),
                new Client("Paulo", "Paul", "paul.paul@laposte.net"),
                new Client("Pierrot", "Pierre", "p.p@laposte.net"),
                new Client("Louis", "Lou", "l.l@laposte.net"),
                new Client("Alexandros", "Alex", "alex.alex@laposte.net"),
                new Client("Bernard", "Lucien", "lulu.beber@laposte.net")));

        billeterie.setClients(clients);

       // new Client("Bernard", "Lucien", "lulu.beber@laposte.net").acheterBillet(new Evenement( "Concert: Pink Floyd", new Client("Bernard", "Lucien", "lulu.beber@laposte.net"),new Evenement("Concert", "20/05/2023","20h00", new Lieu("Cigale","Paris",1000),50,3)));

    }

    public static void menu() {
        String propositions[] = {"1- Ajouter un client", "2- Afficher la liste des clients", "3- Afficher les achats de billet(s) d’un client", "4- Ajouter un achat de billet", "5- Annuler un achat de billet", "6- Afficher la liste des achats de billets ", "0- Quitter"};

        System.out.printf("Welcome to " + billeterie.name);
        System.out.println();
        for (String p : propositions) {
            System.out.println(p);
        }

        int choice = parseInt(sc.next());

        switch (choice) {
            case 1:
                addClient();
                menu();

            case 2:
                voirClient();
                menu();

            case 3:
                VoirAchatParClient();
                menu();

            case 4:
                acheterBillet();
                menu();

            case 5:
                annulerAchat();
                menu();

            case 6:
                voirTousLesAchats();
                menu();

            case 0:
                break;


            default:


                System.out.println("Je n'ai pas compris votre demande veuillez réessayer svp");
                menu();

        }
    }

    public static void addClient() {
        System.out.println("Quel est votre nom? ");
        String nom = sc.next();

        System.out.println("Quel est votre prénom? ");
        String prenom = sc.next();

        System.out.println("Quel est email? ");
        String email = sc.next();

        billeterie.addClient(nom, prenom, email);
    }

    public static void voirClient() {
        List<Client> clients = billeterie.getClients();

        for (Client c : clients) {
            System.out.println(c);
        }
    }

    public static void showReservationByClient() {
        System.out.println("De quel client souhaitez-vous afficher les billets achetés ? Entrez son nom");

        String clientNom = sc.next();

        List<Client> clients = billeterie.getClients();
        for (Client c : clients) {
            if (c.getNom().equals(clientNom))
                selectedClient = c;
        }

        System.out.println("Voici les billets achetés du client ");
        List<Evenement> evenements = selectedClient.getNombreBilletsAchetes();

        for (Evenement e : evenements) {
            System.out.println(e);
        }
    }

    public static void acheterBillet() {
        voirClient();

        System.out.println("Quel est le client souhaitant acheter un billet ? Entrez son nom ");

        String clientNom = sc.next();

        List<Client> clients = billeterie.getClients();
        for (Client c : clients) {
            if (c.getNom() == clientNom)
                selectedClient = c;
        }


    }

}