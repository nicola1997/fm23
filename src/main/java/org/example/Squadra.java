package org.example;

import java.util.ArrayList;

public class Squadra {
    private String nome;
    private ArrayList<Calciatore> giocatori;

    public Squadra(String nome) {
        this.nome = nome;
        this.giocatori = new ArrayList<>();
    }

    public void aggiungiGiocatore(Calciatore giocatore) {
        giocatori.add(giocatore);
    }

    public void rimuoviGiocatore(Calciatore giocatore) {
        giocatori.remove(giocatore);
    }

    public ArrayList<Calciatore> getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(ArrayList<Calciatore> giocatori) {
        this.giocatori = giocatori;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
