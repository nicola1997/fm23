package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] nomiSquadre={"Juventus","Inter","Milan","Napoli","Atalanta","Lazio","Roma","Torino","Bologna","Verona",
        "Lecce","Sampdoria","Monza","Cremonese","Fiorentina","Spezia","Udinese","Empoli","Sassuolo","Salerninata"};


        ArrayList <Squadra> squadreA= new ArrayList<>();

        for (int i=0;i<nomiSquadre.length;i++){
            squadreA.add(new Squadra(nomiSquadre[i]));
        }
        Campionato c= new Campionato("serieA",squadreA);

        int i=0;
        int j=0;
        while(i<c.squadre.size()){
            j=0;
            while(j<c.squadre.size()){
                if(j!=i){
                    c.match(c.getCampionato().get(i),c.getCampionato().get(j));
                }
                j++;
            }
            //System.out.println(i);
            i++;
        }


        c.sort();


    }
}