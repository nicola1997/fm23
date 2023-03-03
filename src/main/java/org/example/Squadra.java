package org.example;

import java.security.PublicKey;
import java.util.ArrayList;

public class Squadra {
    private final String nome;
    private int punti;
    private int partite;
    private int vittorie;
    private int pareggi;
    private int sconfitte;
    private ArrayList<Calciatore> calciatori;
    private int nGiocatori;


    public Squadra(String nome) {
        this.nome = nome;
        this.punti=0;
        this.calciatori = new ArrayList<Calciatore>();
        for(int i=0;i<20;i++){
            calciatori.add(new Calciatore());
            calciatori.get(i).setSquadra(getNome());
        }
        nGiocatori=calciatori.size();      //da vedere
    }
    public void azzera(){
        punti=0;
        vittorie=0;
        pareggi=0;
        sconfitte=0;
        partite=0;
    }


    public int getPartite() {
        return partite;
    }

    public void setPartite(int partite) {
        this.partite = partite;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public int getPareggi() {
        return pareggi;
    }

    public void setPareggi(int pareggi) {
        this.pareggi = pareggi;
    }

    public int getSconfitte() {
        return sconfitte;
    }

    public void setSconfitte(int sconfitte) {
        this.sconfitte = sconfitte;
    }

    public int getnGiocatori() {
        return nGiocatori;
    }

    public void setnGiocatori(int nGiocatori) {
        this.nGiocatori = nGiocatori;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }
    public Calciatore getCalciatore(int i){
        return calciatori.get(i);
    }

    public void aggiungiGiocatore(Calciatore giocatore) {
        calciatori.add(giocatore);
    }

    public void rimuoviGiocatore(Calciatore giocatore) {
        calciatori.remove(giocatore);
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", punti=" + punti +
                ", calciatori=" + calciatori +
                '}';
    }
}
