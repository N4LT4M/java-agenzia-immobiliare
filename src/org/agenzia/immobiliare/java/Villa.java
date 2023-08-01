package org.agenzia.immobiliare.java;

public class Villa extends Abitazione {
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
    private int gardenDimension;


    public Villa(String alphanumericCode, String address, int cap, String city, int surfaceAreaSquareMeters, int rooms, int bathrooms, int gardenDimension) {
        super(alphanumericCode, address, cap, city, surfaceAreaSquareMeters, rooms, bathrooms);
        this.gardenDimension = gardenDimension;
    }
    //getter e setter

    //metodi
    public void reimpostaSuperfici (int surfaceAreaSquareMeters, int gardenDimension){
        super.reimpostaSuperfici(surfaceAreaSquareMeters);
        this.gardenDimension = gardenDimension;
    }

    @Override
    public String toString (){
        return super.toString() + " " + gardenDimension;
    }
}
