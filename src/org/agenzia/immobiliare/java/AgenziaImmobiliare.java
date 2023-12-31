package org.agenzia.immobiliare.java;

import java.util.ArrayList;

public class AgenziaImmobiliare {
    /*
    Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
Gli immobili sono caratterizzati da:
-un codice alfanumerico,
-indirizzo,
-cap,
-città
una superficie espressa in mq attraverso un numero intero.
Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto e aggiungere un metodo per incrementare questo numero.
L’agenzia gestisce diverse tipologie di immobili:
-Box
-Abitazione
-Villa
Per i box è riportato il numero di posti auto.
Per le abitazioni è riportato il numero di vani e il numero di bagni.
Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie.
Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie e superficieGiardino.
Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
-un metodo per aggiungere un immobile
-un metodo per la ricerca di un immobile a partire dal codice alfanumerico
-un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi
     */

    //nuova array list che conterrà gli immobili
    private ArrayList<Immobile> immobileArrayList = new ArrayList<>();
    //metodo per aggiunere elementi alla lista
    public void add (Immobile i){
        immobileArrayList.add(i);
    }

    public ArrayList<Immobile> getImmobileArrayList (){
        return this.immobileArrayList;
    }

    //metodo per trovare elementi nella lista basandosi sul codice alfanumerico
    public Immobile search (String alphanumericCode){
        for (int i = 0; i < immobileArrayList.size(); i++) {
            Immobile immobile = immobileArrayList.get(i);
            if (alphanumericCode.equals(immobile.getAlphanumericCode())){
                return immobile;
            }

        } return null;
    }

    //metodo per restituire immobile con maggior numero di persone interessate
    public Immobile mostLiked (){
        if (immobileArrayList.size() == 0){
            return null;
        }
        Immobile bestImmobile = immobileArrayList.get(0);
        for (int i = 0; i < immobileArrayList.size(); i++) {
            Immobile likedImmobile = immobileArrayList.get(i);
            if (bestImmobile.getInterestedPeople() <= likedImmobile.getInterestedPeople()) {
                bestImmobile = likedImmobile;
            }
        }return bestImmobile;


    }
}
