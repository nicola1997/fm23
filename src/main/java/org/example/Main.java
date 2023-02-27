package org.example;

public class Main {
    public static void main(String[] args) {

        Squadra s= new Squadra("Inter");

        Calciatore c0=new Calciatore();
        Calciatore c1=new Calciatore();
        Calciatore c2=new Calciatore();


        s.aggiungiGiocatore(c0);
        s.aggiungiGiocatore(c1);
        s.aggiungiGiocatore(c2);

        System.out.println(s);

    }
}