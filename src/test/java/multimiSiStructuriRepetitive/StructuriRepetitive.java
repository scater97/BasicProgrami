package multimiSiStructuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    //Structurile repetitive sunt blocuri de cod care parcurg un anumit interval de valori.
    //for, while, foreach.
    //In Java array(multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip(primitive
    //sau de referinte)
    //Un array are o dimensiune fixa.

    @Test
    public void afisareDate(){
        //colegiDeCursArray();
        //colegiDeCursLista();
        //exempluHasmap1();
        exempluHasmap2();
    }

    public void colegiDeCursArray(){
        String[] colegi=new String[7];
        colegi[0]= "Senty";
        colegi[1]= "Eduard";
        colegi[2]= "Gabriela";
        colegi[3]= "Ionut";
        colegi[4]= "Ramona";
        colegi[5]= "Mihai";
        colegi[6]= "Andreea";

        //for(initializarea; conditie; increment){
        //in interior sa se execute un bloc de cod in mod repetat
        //}
        for (int index=0; index< colegi. length; index++){
            System.out.println("Numele colegului de la numarul: "+index +" este: "+colegi[index]);
        }
    }

    //listele sunt o colectie ordonata de elemente
    //fiecare element poate fi accesat printr-un index numeric
    //elementele intr-o lista sunt stocate in ordinea in care sunt adaugate
    //ca implementare se foloseste ArrayList

    public void colegiDeCursLista() {
        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Senty");
        colegiLista.add("Edi");
        colegiLista.add("Gabriela");
        colegiLista.add("Ionut");
        colegiLista.add("Ramona");
        colegiLista.add("Mihai");
        colegiLista.add("Andreea");
        colegiLista.add("Fabian");

        //while este o structura de control utilizata pentru a executa in mod repetat un bloc de cod atata timp cat o
        //conditie este adevarata
        //index
        //while(conditie){
        //  bloc de cod care se executa repetat
        //index++
        //}

        int index = 0;
        while (index < colegiLista.size()) {
            System.out.println("Numele colegului este: " + colegiLista.get(index));
            index++;
        }
        //hasmap este o implementare a unei colectii de tip perecje(cheie/valoare)
        //fiecare element din hasmap este o pereche formata dintr-o cheie si o valoare asociata
        //cu aceasi cheie
        //cheile sunt unice, nu pot fu dublicate
    }
        public void exempluHasmap1(){
            HashMap<String, String> categoriiLucruri = new HashMap<>();
            categoriiLucruri.put("Flori","Trandafiri");
            categoriiLucruri.put("Fructe", "Para");
            categoriiLucruri.put("Legume", "Cartof");
            categoriiLucruri.put("Condimente", "Sare");

            //foreach este o structura alternativa mai avansata a unui for
            //se poate utiliza sa iteram printr-o colectie fara a fi nevoie sa se utilizeze in index
            //foreach(tipul de element /String numele:colectia care merge (cheie)){
            //blocul de cod care se executa repetat pentru fiecare element din colectie
            //}

            for (String key:categoriiLucruri.keySet()){
                System.out.println("Categoria este: "+key + ", obiectul din categorie este: " + categoriiLucruri.get(key));

        }

    }
    public void exempluHasmap2() {
        HashMap<String, List<String>> tariSiOrase = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Brasov");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Sevilia");
        oraseSpania.add("Madrid");
        oraseSpania.add("Girona");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Torino");
        oraseItalia.add("Venetia");
        oraseItalia.add("Genova");

        List<String> oraseGermania = new ArrayList<>();
        oraseGermania.add("Stuttgart");
        oraseGermania.add("Berlin");
        oraseGermania.add("Koln");
        oraseGermania.add("Dusseldorf");

        tariSiOrase.put("Romania", oraseRomania);
        tariSiOrase.put("Spania", oraseSpania);
        tariSiOrase.put("Italia", oraseItalia);
        tariSiOrase.put("Germania", oraseGermania);

        for (String key:tariSiOrase.keySet()){
            System.out.println("Orasele din tara " + key + " sunt" + tariSiOrase.get(key));
        }
    }
}
