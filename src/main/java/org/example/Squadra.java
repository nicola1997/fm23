package org.example;

import java.util.ArrayList;

public class Squadra {
    private String nome;
    private ArrayList<Calciatore> calciatori;

    public Squadra(String nome) {
        this.nome = nome;
        this.calciatori = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "nome='" + nome + '\'' +
                ", calciatori=" + calciatori +
                '}';
    }

    public void aggiungiGiocatore(Calciatore giocatore) {
        calciatori.add(giocatore);
    }

    public void rimuoviGiocatore(Calciatore giocatore) {
        calciatori.remove(giocatore);
    }

    public ArrayList<Calciatore> getGiocatori() {
        return calciatori;
    }

    public void setGiocatori(ArrayList<Calciatore> giocatori) {
        this.calciatori = giocatori;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
