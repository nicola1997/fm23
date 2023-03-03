package org.example;
import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] nomiSquadre={"Juventus","Inter","Milan","Napoli","Atalanta","Lazio","Roma","Torino","Bologna","Verona",
        "Lecce","Sampdoria","Monza","Cremonese","Fiorentina","Spezia","Udinese","Empoli","Sassuolo","Salerninata"};

        ArrayList <Squadra> squadreA= new ArrayList<>();

        for (int i=0;i<nomiSquadre.length;i++){
            squadreA.add(new Squadra(nomiSquadre[i]));
        }
        Campionato c= new Campionato("Serie A",squadreA);

        Ui ui=new Ui(c);


        Scanner s=new Scanner(System.in);

        //while(true){
        //    System.out.println("1: Classifica\n2: Database\n3: Cerca squadra");
        //    String input=s.nextLine();
        //    switch (input){
        //        case("1"):          c.sort(); break;
        //        case("2"):          System.out.println(c.toString()); break;
        //        case("3"):          System.out.println("Inserisci una squadra:");
                                  //  input=s.nextLine();
                                  // for( i=0;i<c.getSquadre().size();i++ ){
                                  //     if(Objects.equals(c.getSquadre().get(i).getNome(), input)){
                                  //         System.out.println(c.getSquadre().get(i));
                                  //     }
                                  // }
                                  //  break;
         //   }
       // }

    }
}