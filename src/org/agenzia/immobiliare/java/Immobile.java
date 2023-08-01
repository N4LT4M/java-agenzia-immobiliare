package org.agenzia.immobiliare.java;

public class Immobile {
    /*
    Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
Gli immobili sono caratterizzati da:
-un codice alfanumerico,
-indirizzo,
-cap,
-città
-una superficie espressa in mq attraverso un numero intero.
Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto e aggiungere un metodo per incrementare questo numero.
L’agenzia gestisce diverse tipologie di immobili:
-Box
-Abitazione
-Villa
Per i box è riportato il numero di posti auto. - fatto
Per le abitazioni è riportato il numero di vani e il numero di bagni. - fatto
Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino. - fatto
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile. - fatto
Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie. - fatto
Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie e superficieGiardino.
Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
-un metodo per aggiungere un immobile
-un metodo per la ricerca di un immobile a partire dal codice alfanumerico
-un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi
     */

    //attributi
    private String alphanumericCode;
    private String address;
    private int cap;
    private String city;
    private int surfaceAreaSquareMeters;
    private int interestedPeople;

    //costruttore
    public Immobile(String alphanumericCode, String address, int cap, String city, int surfaceAreaSquareMeters) {
        this.alphanumericCode = alphanumericCode;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.surfaceAreaSquareMeters = surfaceAreaSquareMeters;
        this.interestedPeople = 0;
    }
    //getter e setter
    public String getAlphanumericCode() {
        return alphanumericCode;
    }

    public String getAddress() {
        return address;
    }

    public int getCap() {
        return cap;
    }

    public String getCity() {
        return city;
    }

    public int getSurfaceAreaSquareMeters() {
        return surfaceAreaSquareMeters;
    }

    public int getInterestedPeople() {
        return interestedPeople;
    }

    //metodi

    /*public int addInterestedPeople(){
        interestedPeople++;
        return interestedPeople;
    }
     */
    public void addInterestedPeople(){
        interestedPeople++;
    }

    public void reimpostaSuperfici (int surfaceAreaSquareMeters){
        this.surfaceAreaSquareMeters = surfaceAreaSquareMeters;
    }

    //metodo toString
    @Override
    public String toString(){
        String s = alphanumericCode + " " + address + " " + cap + " " + city + " " +surfaceAreaSquareMeters;
        return s;
    }
}
