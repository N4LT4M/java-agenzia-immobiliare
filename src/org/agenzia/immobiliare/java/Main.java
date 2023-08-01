package org.agenzia.immobiliare.java;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile. -testato
Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie. - testato
Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie e superficieGiardino. - testato
Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
-un metodo per aggiungere un immobile - testato
-un metodo per la ricerca di un immobile a partire dal codice alfanumerico - testato
-un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate -
Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi
     */
        Scanner scan = new Scanner(System.in);
        Immobile i = new Immobile("42c", "via pioppi 17", 20142, "milano", 100);
        i.addInterestedPeople();
        System.out.println("there are " + i.getInterestedPeople() + " people interested");
        System.out.println(i.toString());

        Box b = new Box("54m", "via ciliegi 11", 20143, "milano", 50, 2);
        System.out.println(b.toString());
        b.reimpostaSuperfici(300);
        System.out.println("there are " + b.getInterestedPeople() + " interested people");
        //le persone interessate aumentano di 20
        for (int j = 0; j < 20; j++) {
            b.addInterestedPeople();
        }
        //metodo per riconoscere quante sono le persone interessate
        System.out.println("there are " + b.getInterestedPeople() + " interested people");

        System.out.println(b.toString());



        Abitazione a = new Abitazione("75f", "via prugne 5", 20122, "milano", 75, 5, 1);
        System.out.println("there are " + a.getInterestedPeople() + " interested people");
        //le persone interessate aumentano di 20
        for (int j = 0; j < 10; j++) {
            a.addInterestedPeople();
        }
        //metodo per riconoscere quante sono le persone interessate
        System.out.println("there are " + a.getInterestedPeople() + " interested people");

        Villa v = new Villa("80x", "via pesche 7", 20123, "milano", 200, 8, 2, 20);
        //dimensioni prima di applicare il metodo
        System.out.println(v.toString());
        //persone interessate prima
        System.out.println("there are " + v.getInterestedPeople() + " interested people");
        //le persone interessate aumentano di 20
        for (int j = 0; j < 50; j++) {
            v.addInterestedPeople();
        }
        //metodo per riconoscere quante sono le persone interessate
        System.out.println("there are " + v.getInterestedPeople() + " interested people");
        //applico il metodo per cambiare la superficie della villa
        v.reimpostaSuperfici(500, 70);
        //dimensioni dopo aver modificato
        System.out.println(v.toString());

        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
        agenzia.add(a);
        agenzia.add(b);
        agenzia.add(v);
        //System.out.println(agenzia.getImmobileArrayList());
        for (int k = 0; k < agenzia.getImmobileArrayList().size(); k++) {
            Immobile imm = agenzia.getImmobileArrayList().get(k);
            System.out.println(imm);
        }
        /*
        for (Immobile imm : agenzia.getImmobileArrayList()) {
            System.out.println(imm);
        }
         */

            Immobile immobile = agenzia.search("80x");
        System.out.println("l'immobile è: " + immobile);

        Immobile mostLiked = agenzia.mostLiked();
        System.out.println("l'immobile che piace di più è: " + mostLiked);






    }
}
