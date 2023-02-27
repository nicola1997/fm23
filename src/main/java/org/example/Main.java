package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] nomiSquadre={"Juventus","Inter","Milan","Napoli","Atalanta","Lazio","Roma","Torino","Bologna","Verona",
        "Lecce","Sampdoria","Monza","Cremonese","Fiorentina","Spezia","Udinese","Empoli","Sassuolo","Salerninata"};


        ArrayList <Squadra> squadreA= new ArrayList<>();

        for (int i=0;i<20;i++){
            squadreA.add(new Squadra(nomiSquadre[i]));
        }
        Campionato c= new Campionato("serieA",squadreA);
        System.out.println(c);

        

    }
}